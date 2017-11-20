/*
 * This file is generated by jOOQ.
*/
package ${package}.database.or.pg_catalog.routines;


import ${package}.database.generator.converter.LongConverter;
import ${package}.database.or.pg_catalog.PgCatalog;

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
public class DenseRank1 extends AbstractRoutine<BigDecimal> {

    private static final long serialVersionUID = -250465407;

    /**
     * The parameter <code>pg_catalog.dense_rank.RETURN_VALUE</code>.
     */
    public static final Parameter<BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BIGINT, false, false, new LongConverter());

    /**
     * Create a new routine call instance
     */
    public DenseRank1() {
        super("dense_rank", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.BIGINT, new LongConverter());

        setReturnParameter(RETURN_VALUE);
        setOverloaded(true);
    }
}
