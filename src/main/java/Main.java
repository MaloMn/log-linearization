import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import co.elastic.clients.elasticsearch.core.search.Hit;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.rest_client.RestClientTransport;
import com.goebl.david.Webb;
import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.nio.client.HttpAsyncClientBuilder;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.json.JSONObject;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // curl http://k-elastic-c3a4b8.kb.francecentral.azure.elastic-cloud.com:9243/logstash-*/_search

        Webb webb = Webb.create();
        JSONObject result = webb
                .post("http://k-elastic-c3a4b8.kb.francecentral.azure.elastic-cloud.com:9243/logstash-*/_search")
                .header("Content-Type", "application/x-www-form-urlencoded")
                .header("apikey", "xxxx")
                .body("name=abcd&email=test@test.com.com&id=abc")
                .asJsonObject()
                .getBody();
    }

}
