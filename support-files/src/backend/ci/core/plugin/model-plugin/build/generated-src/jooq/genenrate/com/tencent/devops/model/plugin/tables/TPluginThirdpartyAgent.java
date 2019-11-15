/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.plugin.tables;


import com.tencent.devops.model.plugin.DevopsPlugin;
import com.tencent.devops.model.plugin.Keys;
import com.tencent.devops.model.plugin.tables.records.TPluginThirdpartyAgentRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TPluginThirdpartyAgent extends TableImpl<TPluginThirdpartyAgentRecord> {

    private static final long serialVersionUID = 241002646;

    /**
     * The reference instance of <code>devops_plugin.T_PLUGIN_THIRDPARTY_AGENT</code>
     */
    public static final TPluginThirdpartyAgent T_PLUGIN_THIRDPARTY_AGENT = new TPluginThirdpartyAgent();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TPluginThirdpartyAgentRecord> getRecordType() {
        return TPluginThirdpartyAgentRecord.class;
    }

    /**
     * The column <code>devops_plugin.T_PLUGIN_THIRDPARTY_AGENT.ID</code>.
     */
    public final TableField<TPluginThirdpartyAgentRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>devops_plugin.T_PLUGIN_THIRDPARTY_AGENT.PROJECT_ID</code>.
     */
    public final TableField<TPluginThirdpartyAgentRecord, String> PROJECT_ID = createField("PROJECT_ID", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>devops_plugin.T_PLUGIN_THIRDPARTY_AGENT.HOSTNAME</code>.
     */
    public final TableField<TPluginThirdpartyAgentRecord, String> HOSTNAME = createField("HOSTNAME", org.jooq.impl.SQLDataType.VARCHAR.length(128).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>devops_plugin.T_PLUGIN_THIRDPARTY_AGENT.IP</code>.
     */
    public final TableField<TPluginThirdpartyAgentRecord, String> IP = createField("IP", org.jooq.impl.SQLDataType.VARCHAR.length(64).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>devops_plugin.T_PLUGIN_THIRDPARTY_AGENT.OS</code>.
     */
    public final TableField<TPluginThirdpartyAgentRecord, String> OS = createField("OS", org.jooq.impl.SQLDataType.VARCHAR.length(16).nullable(false), this, "");

    /**
     * The column <code>devops_plugin.T_PLUGIN_THIRDPARTY_AGENT.DETECT_OS</code>.
     */
    public final TableField<TPluginThirdpartyAgentRecord, String> DETECT_OS = createField("DETECT_OS", org.jooq.impl.SQLDataType.VARCHAR.length(128).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>devops_plugin.T_PLUGIN_THIRDPARTY_AGENT.STATUS</code>.
     */
    public final TableField<TPluginThirdpartyAgentRecord, Integer> STATUS = createField("STATUS", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>devops_plugin.T_PLUGIN_THIRDPARTY_AGENT.SECRET_KEY</code>.
     */
    public final TableField<TPluginThirdpartyAgentRecord, String> SECRET_KEY = createField("SECRET_KEY", org.jooq.impl.SQLDataType.VARCHAR.length(256).nullable(false), this, "");

    /**
     * The column <code>devops_plugin.T_PLUGIN_THIRDPARTY_AGENT.CREATED_USER</code>.
     */
    public final TableField<TPluginThirdpartyAgentRecord, String> CREATED_USER = createField("CREATED_USER", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>devops_plugin.T_PLUGIN_THIRDPARTY_AGENT.CREATED_TIME</code>.
     */
    public final TableField<TPluginThirdpartyAgentRecord, LocalDateTime> CREATED_TIME = createField("CREATED_TIME", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * Create a <code>devops_plugin.T_PLUGIN_THIRDPARTY_AGENT</code> table reference
     */
    public TPluginThirdpartyAgent() {
        this("T_PLUGIN_THIRDPARTY_AGENT", null);
    }

    /**
     * Create an aliased <code>devops_plugin.T_PLUGIN_THIRDPARTY_AGENT</code> table reference
     */
    public TPluginThirdpartyAgent(String alias) {
        this(alias, T_PLUGIN_THIRDPARTY_AGENT);
    }

    private TPluginThirdpartyAgent(String alias, Table<TPluginThirdpartyAgentRecord> aliased) {
        this(alias, aliased, null);
    }

    private TPluginThirdpartyAgent(String alias, Table<TPluginThirdpartyAgentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DevopsPlugin.DEVOPS_PLUGIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TPluginThirdpartyAgentRecord, Integer> getIdentity() {
        return Keys.IDENTITY_T_PLUGIN_THIRDPARTY_AGENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TPluginThirdpartyAgentRecord> getPrimaryKey() {
        return Keys.KEY_T_PLUGIN_THIRDPARTY_AGENT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TPluginThirdpartyAgentRecord>> getKeys() {
        return Arrays.<UniqueKey<TPluginThirdpartyAgentRecord>>asList(Keys.KEY_T_PLUGIN_THIRDPARTY_AGENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPluginThirdpartyAgent as(String alias) {
        return new TPluginThirdpartyAgent(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TPluginThirdpartyAgent rename(String name) {
        return new TPluginThirdpartyAgent(name, null);
    }
}