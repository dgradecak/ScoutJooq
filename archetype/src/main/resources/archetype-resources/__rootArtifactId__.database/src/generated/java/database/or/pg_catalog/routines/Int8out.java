/*
 * This file is generated by jOOQ.
*/
package ${package}.database.or.pg_catalog.routines;


import ${package}.database.generator.converter.LongConverter;
import ${package}.database.or.pg_catalog.PgCatalog;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
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

/**
 * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
 */
@java.lang.Deprecated
public class Int8out extends AbstractRoutine<Object> {

    private static final long serialVersionUID = -178277634;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("cstring"), false, false);

    /**
     * The parameter <code>pg_catalog.int8out._1</code>.
     */
    public static final Parameter<BigDecimal> _1 = createParameter("_1", org.jooq.impl.SQLDataType.BIGINT, false, true, new LongConverter());

    /**
     * Create a new routine call instance
     */
    public Int8out() {
        super("int8out", PgCatalog.PG_CATALOG, org.jooq.impl.DefaultDataType.getDefaultDataType("cstring"));

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(BigDecimal value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<BigDecimal> field) {
        setField(_1, field);
    }
}
