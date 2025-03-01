package az.coders.spring.CINEMA_MVC.configs;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@ComponentScan("az.coders.spring.CINEMA_MVC")
@PropertySource(value = "classpath:application.properties")
@EnableTransactionManagement
public class SpringConfig {
    @Autowired
    Environment environment;

    @Bean
    public DataSource dataSource() throws ClassNotFoundException {
        String url = environment.getProperty("datasource.url");
        String username = environment.getProperty("datasource.username");
        String password = environment.getProperty("datasource.password");
        System.out.println("url: " + url);
        System.out.println("username: " + username);
        System.out.println("password: " + password);
        System.out.println("////////////");
        Class.forName("org.postgresql.Driver");
        return new DriverManagerDataSource(url, username, password);
    }

    @Bean
    LocalSessionFactoryBean sessionFactory() throws ClassNotFoundException {
        System.out.println("////////////");
        LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource());
        sessionFactoryBean.setPackagesToScan("az.coders.spring.CINEMA_MVC");
        Properties properties = new Properties();
        properties.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
        properties.put("hibernate.show_sql", "none");
        properties.put("hibernate.hbm2ddl.auto", "none");
        sessionFactoryBean.setHibernateProperties(properties);
        System.out.println("////////////");
        return sessionFactoryBean;

    }

    @Bean
    public HibernateTransactionManager transactionManager() throws ClassNotFoundException {
        HibernateTransactionManager hibernateTransactionManager = new HibernateTransactionManager();
        hibernateTransactionManager.setSessionFactory(sessionFactory().getObject());
        System.out.println("////////////");
        return hibernateTransactionManager;

    }


    //    from file in WEB-INF: dispatcher-servlet.xml
//     <bean id="viewResolver" class="org.springframework.web.servlet.view.InternalResourceViewResolver">
//        <property name="prefix" value="/WEB-INF/views/"/>
//        <property name="suffix" value=".jsp"/>
//    </bean>
    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
}
