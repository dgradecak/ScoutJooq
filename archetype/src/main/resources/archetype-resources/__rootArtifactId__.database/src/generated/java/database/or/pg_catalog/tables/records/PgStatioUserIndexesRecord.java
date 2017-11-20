/*
 * This file is generated by jOOQ.
*/
package ${package}.database.or.pg_catalog.tables.records;


import ${package}.database.or.pg_catalog.tables.PgStatioUserIndexes;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;


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
public class PgStatioUserIndexesRecord extends TableRecordImpl<PgStatioUserIndexesRecord> implements Record7<Long, Long, String, String, String, BigDecimal, BigDecimal> {

    private static final long serialVersionUID = -1582060652;

    /**
     * Setter for <code>pg_catalog.pg_statio_user_indexes.relid</code>.
     */
    public void setRelid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_user_indexes.relid</code>.
     */
    public Long getRelid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_user_indexes.indexrelid</code>.
     */
    public void setIndexrelid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_user_indexes.indexrelid</code>.
     */
    public Long getIndexrelid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_user_indexes.schemaname</code>.
     */
    public void setSchemaname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_user_indexes.schemaname</code>.
     */
    public String getSchemaname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_user_indexes.relname</code>.
     */
    public void setRelname(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_user_indexes.relname</code>.
     */
    public String getRelname() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_user_indexes.indexrelname</code>.
     */
    public void setIndexrelname(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_user_indexes.indexrelname</code>.
     */
    public String getIndexrelname() {
        return (String) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_user_indexes.idx_blks_read</code>.
     */
    public void setIdxBlksRead(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_user_indexes.idx_blks_read</code>.
     */
    public BigDecimal getIdxBlksRead() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_statio_user_indexes.idx_blks_hit</code>.
     */
    public void setIdxBlksHit(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_statio_user_indexes.idx_blks_hit</code>.
     */
    public BigDecimal getIdxBlksHit() {
        return (BigDecimal) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, Long, String, String, String, BigDecimal, BigDecimal> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, Long, String, String, String, BigDecimal, BigDecimal> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PgStatioUserIndexes.PG_STATIO_USER_INDEXES.RELID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return PgStatioUserIndexes.PG_STATIO_USER_INDEXES.INDEXRELID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return PgStatioUserIndexes.PG_STATIO_USER_INDEXES.SCHEMANAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return PgStatioUserIndexes.PG_STATIO_USER_INDEXES.RELNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return PgStatioUserIndexes.PG_STATIO_USER_INDEXES.INDEXRELNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return PgStatioUserIndexes.PG_STATIO_USER_INDEXES.IDX_BLKS_READ;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return PgStatioUserIndexes.PG_STATIO_USER_INDEXES.IDX_BLKS_HIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getRelid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getIndexrelid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getSchemaname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getRelname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getIndexrelname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component6() {
        return getIdxBlksRead();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component7() {
        return getIdxBlksHit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getRelid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getIndexrelid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSchemaname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getRelname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getIndexrelname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getIdxBlksRead();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value7() {
        return getIdxBlksHit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatioUserIndexesRecord value1(Long value) {
        setRelid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatioUserIndexesRecord value2(Long value) {
        setIndexrelid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatioUserIndexesRecord value3(String value) {
        setSchemaname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatioUserIndexesRecord value4(String value) {
        setRelname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatioUserIndexesRecord value5(String value) {
        setIndexrelname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatioUserIndexesRecord value6(BigDecimal value) {
        setIdxBlksRead(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatioUserIndexesRecord value7(BigDecimal value) {
        setIdxBlksHit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatioUserIndexesRecord values(Long value1, Long value2, String value3, String value4, String value5, BigDecimal value6, BigDecimal value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatioUserIndexesRecord
     */
    public PgStatioUserIndexesRecord() {
        super(PgStatioUserIndexes.PG_STATIO_USER_INDEXES);
    }

    /**
     * Create a detached, initialised PgStatioUserIndexesRecord
     */
    public PgStatioUserIndexesRecord(Long relid, Long indexrelid, String schemaname, String relname, String indexrelname, BigDecimal idxBlksRead, BigDecimal idxBlksHit) {
        super(PgStatioUserIndexes.PG_STATIO_USER_INDEXES);

        set(0, relid);
        set(1, indexrelid);
        set(2, schemaname);
        set(3, relname);
        set(4, indexrelname);
        set(5, idxBlksRead);
        set(6, idxBlksHit);
    }
}
