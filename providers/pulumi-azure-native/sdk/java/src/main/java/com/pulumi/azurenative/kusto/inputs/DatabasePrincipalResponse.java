// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kusto.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A class representing database principal entity.
 * 
 */
public final class DatabasePrincipalResponse extends com.pulumi.resources.InvokeArgs {

    public static final DatabasePrincipalResponse Empty = new DatabasePrincipalResponse();

    /**
     * Application id - relevant only for application principal type.
     * 
     */
    @Import(name="appId")
    private @Nullable String appId;

    /**
     * @return Application id - relevant only for application principal type.
     * 
     */
    public Optional<String> appId() {
        return Optional.ofNullable(this.appId);
    }

    /**
     * Database principal email if exists.
     * 
     */
    @Import(name="email")
    private @Nullable String email;

    /**
     * @return Database principal email if exists.
     * 
     */
    public Optional<String> email() {
        return Optional.ofNullable(this.email);
    }

    /**
     * Database principal fully qualified name.
     * 
     */
    @Import(name="fqn")
    private @Nullable String fqn;

    /**
     * @return Database principal fully qualified name.
     * 
     */
    public Optional<String> fqn() {
        return Optional.ofNullable(this.fqn);
    }

    /**
     * Database principal name.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Database principal name.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Database principal role.
     * 
     */
    @Import(name="role", required=true)
    private String role;

    /**
     * @return Database principal role.
     * 
     */
    public String role() {
        return this.role;
    }

    /**
     * The tenant name of the principal
     * 
     */
    @Import(name="tenantName", required=true)
    private String tenantName;

    /**
     * @return The tenant name of the principal
     * 
     */
    public String tenantName() {
        return this.tenantName;
    }

    /**
     * Database principal type.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return Database principal type.
     * 
     */
    public String type() {
        return this.type;
    }

    private DatabasePrincipalResponse() {}

    private DatabasePrincipalResponse(DatabasePrincipalResponse $) {
        this.appId = $.appId;
        this.email = $.email;
        this.fqn = $.fqn;
        this.name = $.name;
        this.role = $.role;
        this.tenantName = $.tenantName;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabasePrincipalResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabasePrincipalResponse $;

        public Builder() {
            $ = new DatabasePrincipalResponse();
        }

        public Builder(DatabasePrincipalResponse defaults) {
            $ = new DatabasePrincipalResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param appId Application id - relevant only for application principal type.
         * 
         * @return builder
         * 
         */
        public Builder appId(@Nullable String appId) {
            $.appId = appId;
            return this;
        }

        /**
         * @param email Database principal email if exists.
         * 
         * @return builder
         * 
         */
        public Builder email(@Nullable String email) {
            $.email = email;
            return this;
        }

        /**
         * @param fqn Database principal fully qualified name.
         * 
         * @return builder
         * 
         */
        public Builder fqn(@Nullable String fqn) {
            $.fqn = fqn;
            return this;
        }

        /**
         * @param name Database principal name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param role Database principal role.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            $.role = role;
            return this;
        }

        /**
         * @param tenantName The tenant name of the principal
         * 
         * @return builder
         * 
         */
        public Builder tenantName(String tenantName) {
            $.tenantName = tenantName;
            return this;
        }

        /**
         * @param type Database principal type.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public DatabasePrincipalResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.role = Objects.requireNonNull($.role, "expected parameter 'role' to be non-null");
            $.tenantName = Objects.requireNonNull($.tenantName, "expected parameter 'tenantName' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
