module security {

    exports com.mrfurkisan.core.security;
    exports com.mrfurkisan.core.security.repositories;
    exports com.mrfurkisan.core.security.services;
    exports com.mrfurkisan.core.security.enums;

    requires transitive core;
    requires transitive contracts;
    requires lombok;
}
