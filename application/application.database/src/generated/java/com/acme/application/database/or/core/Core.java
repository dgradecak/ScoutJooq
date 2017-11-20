/*
 * This file is generated by jOOQ.
*/
package com.acme.application.database.or.core;


import com.acme.application.database.or.DefaultCatalog;
import com.acme.application.database.or.core.tables.Code;
import com.acme.application.database.or.core.tables.Document;
import com.acme.application.database.or.core.tables.Person;
import com.acme.application.database.or.core.tables.Role;
import com.acme.application.database.or.core.tables.RolePermission;
import com.acme.application.database.or.core.tables.Text;
import com.acme.application.database.or.core.tables.Type;
import com.acme.application.database.or.core.tables.User;
import com.acme.application.database.or.core.tables.UserRole;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Core extends SchemaImpl {

    private static final long serialVersionUID = 887932802;

    /**
     * The reference instance of <code>core</code>
     */
    public static final Core CORE = new Core();

    /**
     * The table <code>core.CODE</code>.
     */
    public final Code CODE = com.acme.application.database.or.core.tables.Code.CODE;

    /**
     * The table <code>core.DOCUMENT</code>.
     */
    public final Document DOCUMENT = com.acme.application.database.or.core.tables.Document.DOCUMENT;

    /**
     * The table <code>core.PERSON</code>.
     */
    public final Person PERSON = com.acme.application.database.or.core.tables.Person.PERSON;

    /**
     * The table <code>core.ROLE</code>.
     */
    public final Role ROLE = com.acme.application.database.or.core.tables.Role.ROLE;

    /**
     * The table <code>core.ROLE_PERMISSION</code>.
     */
    public final RolePermission ROLE_PERMISSION = com.acme.application.database.or.core.tables.RolePermission.ROLE_PERMISSION;

    /**
     * The table <code>core.TEXT</code>.
     */
    public final Text TEXT = com.acme.application.database.or.core.tables.Text.TEXT;

    /**
     * The table <code>core.TYPE</code>.
     */
    public final Type TYPE = com.acme.application.database.or.core.tables.Type.TYPE;

    /**
     * The table <code>core.USER</code>.
     */
    public final User USER = com.acme.application.database.or.core.tables.User.USER;

    /**
     * The table <code>core.USER_ROLE</code>.
     */
    public final UserRole USER_ROLE = com.acme.application.database.or.core.tables.UserRole.USER_ROLE;

    /**
     * No further instances allowed
     */
    private Core() {
        super("core", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Code.CODE,
            Document.DOCUMENT,
            Person.PERSON,
            Role.ROLE,
            RolePermission.ROLE_PERMISSION,
            Text.TEXT,
            Type.TYPE,
            User.USER,
            UserRole.USER_ROLE);
    }
}
