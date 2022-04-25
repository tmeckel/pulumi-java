// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.opsworks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RdsDbInstanceState extends com.pulumi.resources.ResourceArgs {

    public static final RdsDbInstanceState Empty = new RdsDbInstanceState();

    /**
     * A db password
     * 
     */
    @Import(name="dbPassword")
    private @Nullable Output<String> dbPassword;

    /**
     * @return A db password
     * 
     */
    public Optional<Output<String>> dbPassword() {
        return Optional.ofNullable(this.dbPassword);
    }

    /**
     * A db username
     * 
     */
    @Import(name="dbUser")
    private @Nullable Output<String> dbUser;

    /**
     * @return A db username
     * 
     */
    public Optional<Output<String>> dbUser() {
        return Optional.ofNullable(this.dbUser);
    }

    /**
     * The db instance to register for this stack. Changing this will force a new resource.
     * 
     */
    @Import(name="rdsDbInstanceArn")
    private @Nullable Output<String> rdsDbInstanceArn;

    /**
     * @return The db instance to register for this stack. Changing this will force a new resource.
     * 
     */
    public Optional<Output<String>> rdsDbInstanceArn() {
        return Optional.ofNullable(this.rdsDbInstanceArn);
    }

    /**
     * The stack to register a db instance for. Changing this will force a new resource.
     * 
     */
    @Import(name="stackId")
    private @Nullable Output<String> stackId;

    /**
     * @return The stack to register a db instance for. Changing this will force a new resource.
     * 
     */
    public Optional<Output<String>> stackId() {
        return Optional.ofNullable(this.stackId);
    }

    private RdsDbInstanceState() {}

    private RdsDbInstanceState(RdsDbInstanceState $) {
        this.dbPassword = $.dbPassword;
        this.dbUser = $.dbUser;
        this.rdsDbInstanceArn = $.rdsDbInstanceArn;
        this.stackId = $.stackId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RdsDbInstanceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RdsDbInstanceState $;

        public Builder() {
            $ = new RdsDbInstanceState();
        }

        public Builder(RdsDbInstanceState defaults) {
            $ = new RdsDbInstanceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param dbPassword A db password
         * 
         * @return builder
         * 
         */
        public Builder dbPassword(@Nullable Output<String> dbPassword) {
            $.dbPassword = dbPassword;
            return this;
        }

        /**
         * @param dbPassword A db password
         * 
         * @return builder
         * 
         */
        public Builder dbPassword(String dbPassword) {
            return dbPassword(Output.of(dbPassword));
        }

        /**
         * @param dbUser A db username
         * 
         * @return builder
         * 
         */
        public Builder dbUser(@Nullable Output<String> dbUser) {
            $.dbUser = dbUser;
            return this;
        }

        /**
         * @param dbUser A db username
         * 
         * @return builder
         * 
         */
        public Builder dbUser(String dbUser) {
            return dbUser(Output.of(dbUser));
        }

        /**
         * @param rdsDbInstanceArn The db instance to register for this stack. Changing this will force a new resource.
         * 
         * @return builder
         * 
         */
        public Builder rdsDbInstanceArn(@Nullable Output<String> rdsDbInstanceArn) {
            $.rdsDbInstanceArn = rdsDbInstanceArn;
            return this;
        }

        /**
         * @param rdsDbInstanceArn The db instance to register for this stack. Changing this will force a new resource.
         * 
         * @return builder
         * 
         */
        public Builder rdsDbInstanceArn(String rdsDbInstanceArn) {
            return rdsDbInstanceArn(Output.of(rdsDbInstanceArn));
        }

        /**
         * @param stackId The stack to register a db instance for. Changing this will force a new resource.
         * 
         * @return builder
         * 
         */
        public Builder stackId(@Nullable Output<String> stackId) {
            $.stackId = stackId;
            return this;
        }

        /**
         * @param stackId The stack to register a db instance for. Changing this will force a new resource.
         * 
         * @return builder
         * 
         */
        public Builder stackId(String stackId) {
            return stackId(Output.of(stackId));
        }

        public RdsDbInstanceState build() {
            return $;
        }
    }

}
