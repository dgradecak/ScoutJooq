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
public class Scalargtsel extends AbstractRoutine<Double> {

    private static final long serialVersionUID = -2134655844;

    /**
     * The parameter <code>pg_catalog.scalargtsel.RETURN_VALUE</code>.
     */
    public static final Parameter<Double> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> _1 = createParameter("_1", org.jooq.impl.DefaultDataType.getDefaultDataType("internal"), false, true);

    /**
     * The parameter <code>pg_catalog.scalargtsel._2</code>.
     */
    public static final Parameter<Long> _2 = createParameter("_2", org.jooq.impl.SQLDataType.BIGINT, false, true);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> _3 = createParameter("_3", org.jooq.impl.DefaultDataType.getDefaultDataType("internal"), false, true);

    /**
     * The parameter <code>pg_catalog.scalargtsel._4</code>.
     */
    public static final Parameter<Integer> _4 = createParameter("_4", org.jooq.impl.SQLDataType.INTEGER, false, true);

    /**
     * Create a new routine call instance
     */
    public Scalargtsel() {
        super("scalargtsel", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.DOUBLE);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
        addInParameter(_3);
        addInParameter(_4);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Object value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<Object> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(Long value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__2(Field<Long> field) {
        setField(_2, field);
    }

    /**
     * Set the <code>_3</code> parameter IN value to the routine
     */
    public void set__3(Object value) {
        setValue(_3, value);
    }

    /**
     * Set the <code>_3</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__3(Field<Object> field) {
        setField(_3, field);
    }

    /**
     * Set the <code>_4</code> parameter IN value to the routine
     */
    public void set__4(Integer value) {
        setValue(_4, value);
    }

    /**
     * Set the <code>_4</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__4(Field<Integer> field) {
        setField(_4, field);
    }
}
