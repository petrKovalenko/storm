package pkov.stormtutorial;

import java.util.Map;

import org.apache.storm.LocalCluster;
import org.apache.storm.LocalCluster.LocalTopology;
import org.apache.storm.generated.StormTopology;
import org.apache.storm.starter.ExclamationTopology.ExclamationBolt;
import org.apache.storm.task.OutputCollector;
import org.apache.storm.task.TopologyContext;
import org.apache.storm.testing.TestWordSpout;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.topology.TopologyBuilder;
import org.apache.storm.topology.base.BaseRichBolt;
import org.apache.storm.tuple.Fields;
import org.apache.storm.tuple.Tuple;
import org.apache.storm.tuple.Values;
import org.apache.storm.Config;


public class LocalClusterStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (LocalCluster cluster = new LocalCluster()) {
		    //Interact with the cluster...
			
			TopologyBuilder builder = new TopologyBuilder();
	        builder.setSpout("word", new TestWordSpout(), 10);
	        builder.setBolt("exclaim1", new ExclamationBolt2(), 3).shuffleGrouping("word");
	        builder.setBolt("exclaim2", new ExclamationBolt2(), 2).shuffleGrouping("exclaim1");
	        StormTopology st = builder.createTopology();
	        st.validate();
	        Config conf = new Config();
	        conf.put(Config.TOPOLOGY_WORKERS, 4); 
	        conf.put(Config.TOPOLOGY_DEBUG, true);
	        LocalTopology lt = cluster.submitTopology("first", conf, st);
	        System.out.println("ACTIVATIONG TOPOLOGY first");
	        cluster.activate("first");
	        Thread.sleep(15000);
	        System.out.println("DEACTIVATIONG TOPOLOGY first");
	        cluster.deactivate("first");
	        
	        cluster.shutdown();
	        cluster.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	 public static class ExclamationBolt2 extends BaseRichBolt {
	        OutputCollector collector;

	        @Override
	        public void prepare(Map<String, Object> conf, TopologyContext context, OutputCollector collector) {
	            this.collector = collector;
	        }

	        @Override
	        public void execute(Tuple tuple) {
	        	System.out.println("TUPLE_TEXT:'" +  tuple.getString(0) + "'");
	            collector.emit(tuple, new Values(tuple.getString(0) + "!!!"));
	            collector.ack(tuple);
	        }

	        @Override
	        public void declareOutputFields(OutputFieldsDeclarer declarer) {
	            declarer.declare(new Fields("word"));
	        }

	    }

}
