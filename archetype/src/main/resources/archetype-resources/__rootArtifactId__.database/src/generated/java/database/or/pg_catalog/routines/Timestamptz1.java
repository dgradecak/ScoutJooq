/*
 * This file is generated by jOOQ.
*/
package ${package}.database.or.pg_catalog.routines;


import ${package}.database.or.pg_catalog.PgCatalog;

import java.time.OffsetDateTime;

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
public class Timestamptz1 extends AbstractRoutine<OffsetDateTime> {

    private static final long serialVersionUID = -276258972;

    /**
     * The parameter <code>pg_catalog.timestamptz.RETURN_VALUE</code>.
     */
    public static final Parameter<OffsetDateTime> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> _1 = createParameter("_1", org.jooq.impl.DefaultDataType.getDefaultDataType("abstime"), false, true);

    /**
     * Create a new routine call instance
     */
    public Timestamptz1() {
        super("timestamptz", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        setOverloaded(true);
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
}
