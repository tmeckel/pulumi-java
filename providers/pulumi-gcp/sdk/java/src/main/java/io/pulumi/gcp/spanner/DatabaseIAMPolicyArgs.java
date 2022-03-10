// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.spanner;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatabaseIAMPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatabaseIAMPolicyArgs Empty = new DatabaseIAMPolicyArgs();

    /**
     * The name of the Spanner database.
     * 
     */
    @InputImport(name="database", required=true)
      private final Input<String> database;

    public Input<String> getDatabase() {
        return this.database;
    }

    /**
     * The name of the Spanner instance the database belongs to.
     * 
     */
    @InputImport(name="instance", required=true)
      private final Input<String> instance;

    public Input<String> getInstance() {
        return this.instance;
    }

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @InputImport(name="policyData", required=true)
      private final Input<String> policyData;

    public Input<String> getPolicyData() {
        return this.policyData;
    }

    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public DatabaseIAMPolicyArgs(
        Input<String> database,
        Input<String> instance,
        Input<String> policyData,
        @Nullable Input<String> project) {
        this.database = Objects.requireNonNull(database, "expected parameter 'database' to be non-null");
        this.instance = Objects.requireNonNull(instance, "expected parameter 'instance' to be non-null");
        this.policyData = Objects.requireNonNull(policyData, "expected parameter 'policyData' to be non-null");
        this.project = project;
    }

    private DatabaseIAMPolicyArgs() {
        this.database = Input.empty();
        this.instance = Input.empty();
        this.policyData = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseIAMPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> database;
        private Input<String> instance;
        private Input<String> policyData;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseIAMPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.instance = defaults.instance;
    	      this.policyData = defaults.policyData;
    	      this.project = defaults.project;
        }

        public Builder database(Input<String> database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }

        public Builder database(String database) {
            this.database = Input.of(Objects.requireNonNull(database));
            return this;
        }

        public Builder instance(Input<String> instance) {
            this.instance = Objects.requireNonNull(instance);
            return this;
        }

        public Builder instance(String instance) {
            this.instance = Input.of(Objects.requireNonNull(instance));
            return this;
        }

        public Builder policyData(Input<String> policyData) {
            this.policyData = Objects.requireNonNull(policyData);
            return this;
        }

        public Builder policyData(String policyData) {
            this.policyData = Input.of(Objects.requireNonNull(policyData));
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }
        public DatabaseIAMPolicyArgs build() {
            return new DatabaseIAMPolicyArgs(database, instance, policyData, project);
        }
    }
}
