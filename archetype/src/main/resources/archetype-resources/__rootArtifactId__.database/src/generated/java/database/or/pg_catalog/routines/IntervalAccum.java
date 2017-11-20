/*
 * This file is generated by jOOQ.
*/
package ${package}.database.or.pg_catalog.routines;


import ${package}.database.or.pg_catalog.PgCatalog;

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
public class IntervalAccum extends AbstractRoutine<Object[]> {

    private static final long serialVersionUID = -484739027;

    /**
     * The parameter <code>pg_catalog.interval_accum.RETURN_VALUE</code>.
     */
    public static final Parameter<Object[]> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("interval").getArrayDataType(), false, false);

    /**
     * The parameter <code>pg_catalog.interval_accum._1</code>.
     */
    public static final Parameter<Object[]> _1 = createParameter("_1", org.jooq.impl.DefaultDataType.getDefaultDataType("interval").getArrayDataType(), false, true);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> _2 = createParameter("_2", org.jooq.impl.DefaultDataType.getDefaultDataType("interval"), false, true);

    /**
     * Create a new routine call instance
     */
    public IntervalAccum() {
        super("interval_accum", PgCatalog.PG_CATALOG, org.jooq.impl.DefaultDataType.getDefaultDataType("interval").getArrayDataType());

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Object... value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<Object[]> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(Object value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__2(Field<Object> field) {
        setField(_2, field);
    }
}
