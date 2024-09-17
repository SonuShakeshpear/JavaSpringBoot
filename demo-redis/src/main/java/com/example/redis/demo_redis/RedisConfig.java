package com.example.redis.demo_redis;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfig {
	
	@Bean
	public LettuceConnectionFactory getFactory() {
		
		RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration("redis-16985.c9.us-east-1-4.ec2.redns.redis-cloud.com", 16985);
		redisStandaloneConfiguration.setPassword("ggqv3HNfvMLwMkGd4Iko2BKnSX1YTepU");
		LettuceConnectionFactory lettuceConnectionFactory = new LettuceConnectionFactory(redisStandaloneConfiguration);
		return lettuceConnectionFactory;
		
	}
	
	
	
	@Bean
	public RedisTemplate<String, Object> geTemplate(){
		RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
		redisTemplate.setKeySerializer(new StringRedisSerializer());
		redisTemplate.setValueSerializer(new JdkSerializationRedisSerializer());
		
		redisTemplate.setConnectionFactory(getFactory());
		redisTemplate.afterPropertiesSet();
		return redisTemplate;
	}

}
