/*
 * This file is generated by jOOQ.
*/
package com.acme.application.database.or.pg_catalog.routines;


import com.acme.application.database.generator.converter.LongConverter;
import com.acme.application.database.or.pg_catalog.PgCatalog;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgSequenceParameters extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1689698508;

    /**
     * The parameter <code>pg_catalog.pg_sequence_parameters.sequence_oid</code>.
     */
    public static final Parameter<Long> SEQUENCE_OID = createParameter("sequence_oid", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>pg_catalog.pg_sequence_parameters.start_value</code>.
     */
    public static final Parameter<BigDecimal> START_VALUE = createParameter("start_value", org.jooq.impl.SQLDataType.BIGINT, false, false, new LongConverter());

    /**
     * The parameter <code>pg_catalog.pg_sequence_parameters.minimum_value</code>.
     */
    public static final Parameter<BigDecimal> MINIMUM_VALUE = createParameter("minimum_value", org.jooq.impl.SQLDataType.BIGINT, false, false, new LongConverter());

    /**
     * The parameter <code>pg_catalog.pg_sequence_parameters.maximum_value</code>.
     */
    public static final Parameter<BigDecimal> MAXIMUM_VALUE = createParameter("maximum_value", org.jooq.impl.SQLDataType.BIGINT, false, false, new LongConverter());

    /**
     * The parameter <code>pg_catalog.pg_sequence_parameters.increment</code>.
     */
    public static final Parameter<BigDecimal> INCREMENT = createParameter("increment", org.jooq.impl.SQLDataType.BIGINT, false, false, new LongConverter());

    /**
     * The parameter <code>pg_catalog.pg_sequence_parameters.cycle_option</code>.
     */
    public static final Parameter<Boolean> CYCLE_OPTION = createParameter("cycle_option", org.jooq.impl.SQLDataType.BOOLEAN, false, false);

    /**
     * The parameter <code>pg_catalog.pg_sequence_parameters.cache_size</code>.
     */
    public static final Parameter<BigDecimal> CACHE_SIZE = createParameter("cache_size", org.jooq.impl.SQLDataType.BIGINT, false, false, new LongConverter());

    /**
     * The parameter <code>pg_catalog.pg_sequence_parameters.data_type</code>.
     */
    public static final Parameter<Long> DATA_TYPE = createParameter("data_type", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * Create a new routine call instance
     */
    public PgSequenceParameters() {
        super("pg_sequence_parameters", PgCatalog.PG_CATALOG);

        addInParameter(SEQUENCE_OID);
        addOutParameter(START_VALUE);
        addOutParameter(MINIMUM_VALUE);
        addOutParameter(MAXIMUM_VALUE);
        addOutParameter(INCREMENT);
        addOutParameter(CYCLE_OPTION);
        addOutParameter(CACHE_SIZE);
        addOutParameter(DATA_TYPE);
    }

    /**
     * Set the <code>sequence_oid</code> parameter IN value to the routine
     */
    public void setSequenceOid(Long value) {
        setValue(SEQUENCE_OID, value);
    }

    /**
     * Get the <code>start_value</code> parameter OUT value from the routine
     */
    public BigDecimal getStartValue() {
        return get(START_VALUE);
    }

    /**
     * Get the <code>minimum_value</code> parameter OUT value from the routine
     */
    public BigDecimal getMinimumValue() {
        return get(MINIMUM_VALUE);
    }

    /**
     * Get the <code>maximum_value</code> parameter OUT value from the routine
     */
    public BigDecimal getMaximumValue() {
        return get(MAXIMUM_VALUE);
    }

    /**
     * Get the <code>increment</code> parameter OUT value from the routine
     */
    public BigDecimal getIncrement() {
        return get(INCREMENT);
    }

    /**
     * Get the <code>cycle_option</code> parameter OUT value from the routine
     */
    public Boolean getCycleOption() {
        return get(CYCLE_OPTION);
    }

    /**
     * Get the <code>cache_size</code> parameter OUT value from the routine
     */
    public BigDecimal getCacheSize() {
        return get(CACHE_SIZE);
    }

    /**
     * Get the <code>data_type</code> parameter OUT value from the routine
     */
    public Long getDataType() {
        return get(DATA_TYPE);
    }
}
