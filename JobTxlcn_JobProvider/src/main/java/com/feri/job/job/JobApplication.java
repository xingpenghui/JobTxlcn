package com.feri.job.job;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @program: JobTxlcn
 * @description:
 * @author: Feri
 * @create: 2020-03-24 15:33
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.feri.job.job.dao")
@EnableDistributedTransaction
@EnableTransactionManagement
public class JobApplication {
    public static void main(String[] args) {
        SpringApplication.run(JobApplication.class,args);
    }
}
