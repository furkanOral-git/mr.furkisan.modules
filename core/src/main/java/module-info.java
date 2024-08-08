module core {
    
    exports com.mrfurkisan.core.requests;
    exports com.mrfurkisan.core.functional;
    exports com.mrfurkisan.core.models;
    exports com.mrfurkisan.core.repositories;
    exports com.mrfurkisan.core.vulnerabilities;
    exports com.mrfurkisan.core.transactions.contexts;
    exports com.mrfurkisan.core.expression;
    exports com.mrfurkisan.core.application;

    requires lombok;
    requires java.sql;
}
