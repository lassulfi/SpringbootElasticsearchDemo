package br.com.lassulfi.config;

import java.net.InetAddress;
import java.net.InetSocketAddress;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = "br.com.assulfi.repository")
public class ElasticsearchConfig {

	@Value("${elasticsearch.host}")
	private String EsHost;
	
	@Value("${elasticsearch.port}")
	private Integer EsPort;
	
	@Value("${elasticsearch.clustername}")
	private String EsClusterName;
	
	@Bean
	public Client client() {
		Settings esSettings = Settings.builder()
				.put("cluster.name", EsClusterName)
				.build();
		
		TransportClient client = new PreBuiltTransportClient(esSettings).addTransportAddress(new InetSocketAddress(EsHost, EsPort));
		
		
		return client;
	}
	
	
}
