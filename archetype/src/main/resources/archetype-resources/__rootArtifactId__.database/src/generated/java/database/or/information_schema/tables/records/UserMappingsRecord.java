/*
 * This file is generated by jOOQ.
*/
package ${package}.database.or.information_schema.tables.records;


import ${package}.database.or.information_schema.tables.UserMappings;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class UserMappingsRecord extends TableRecordImpl<UserMappingsRecord> implements Record3<String, String, String> {

    private static final long serialVersionUID = -1714988022;

    /**
     * Setter for <code>information_schema.user_mappings.authorization_identifier</code>.
     */
    public void setAuthorizationIdentifier(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.user_mappings.authorization_identifier</code>.
     */
    public String getAuthorizationIdentifier() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.user_mappings.foreign_server_catalog</code>.
     */
    public void setForeignServerCatalog(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.user_mappings.foreign_server_catalog</code>.
     */
    public String getForeignServerCatalog() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.user_mappings.foreign_server_name</code>.
     */
    public void setForeignServerName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.user_mappings.foreign_server_name</code>.
     */
    public String getForeignServerName() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return UserMappings.USER_MAPPINGS.AUTHORIZATION_IDENTIFIER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return UserMappings.USER_MAPPINGS.FOREIGN_SERVER_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return UserMappings.USER_MAPPINGS.FOREIGN_SERVER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getAuthorizationIdentifier();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getForeignServerCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getForeignServerName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getAuthorizationIdentifier();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getForeignServerCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getForeignServerName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserMappingsRecord value1(String value) {
        setAuthorizationIdentifier(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserMappingsRecord value2(String value) {
        setForeignServerCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserMappingsRecord value3(String value) {
        setForeignServerName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserMappingsRecord values(String value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserMappingsRecord
     */
    public UserMappingsRecord() {
        super(UserMappings.USER_MAPPINGS);
    }

    /**
     * Create a detached, initialised UserMappingsRecord
     */
    public UserMappingsRecord(String authorizationIdentifier, String foreignServerCatalog, String foreignServerName) {
        super(UserMappings.USER_MAPPINGS);

        set(0, authorizationIdentifier);
        set(1, foreignServerCatalog);
        set(2, foreignServerName);
    }
}
