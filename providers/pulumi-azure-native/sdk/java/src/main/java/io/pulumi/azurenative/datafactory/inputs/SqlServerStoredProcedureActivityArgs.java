// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.ActivityDependencyArgs;
import io.pulumi.azurenative.datafactory.inputs.ActivityPolicyArgs;
import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.StoredProcedureParameterArgs;
import io.pulumi.azurenative.datafactory.inputs.UserPropertyArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * SQL stored procedure activity type.
 * 
 */
public final class SqlServerStoredProcedureActivityArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlServerStoredProcedureActivityArgs Empty = new SqlServerStoredProcedureActivityArgs();

    /**
     * Activity depends on condition.
     * 
     */
    @Import(name="dependsOn")
      private final @Nullable Output<List<ActivityDependencyArgs>> dependsOn;

    public Output<List<ActivityDependencyArgs>> getDependsOn() {
        return this.dependsOn == null ? Codegen.empty() : this.dependsOn;
    }

    /**
     * Activity description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Linked service reference.
     * 
     */
    @Import(name="linkedServiceName", required=true)
      private final Output<LinkedServiceReferenceArgs> linkedServiceName;

    public Output<LinkedServiceReferenceArgs> getLinkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * Activity name.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * Activity policy.
     * 
     */
    @Import(name="policy")
      private final @Nullable Output<ActivityPolicyArgs> policy;

    public Output<ActivityPolicyArgs> getPolicy() {
        return this.policy == null ? Codegen.empty() : this.policy;
    }

    /**
     * Stored procedure name. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="storedProcedureName", required=true)
      private final Output<Object> storedProcedureName;

    public Output<Object> getStoredProcedureName() {
        return this.storedProcedureName;
    }

    /**
     * Value and type setting for stored procedure parameters. Example: "{Parameter1: {value: "1", type: "int"}}".
     * 
     */
    @Import(name="storedProcedureParameters")
      private final @Nullable Output<Map<String,StoredProcedureParameterArgs>> storedProcedureParameters;

    public Output<Map<String,StoredProcedureParameterArgs>> getStoredProcedureParameters() {
        return this.storedProcedureParameters == null ? Codegen.empty() : this.storedProcedureParameters;
    }

    /**
     * Type of activity.
     * Expected value is 'SqlServerStoredProcedure'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    /**
     * Activity user properties.
     * 
     */
    @Import(name="userProperties")
      private final @Nullable Output<List<UserPropertyArgs>> userProperties;

    public Output<List<UserPropertyArgs>> getUserProperties() {
        return this.userProperties == null ? Codegen.empty() : this.userProperties;
    }

    public SqlServerStoredProcedureActivityArgs(
        @Nullable Output<List<ActivityDependencyArgs>> dependsOn,
        @Nullable Output<String> description,
        Output<LinkedServiceReferenceArgs> linkedServiceName,
        Output<String> name,
        @Nullable Output<ActivityPolicyArgs> policy,
        Output<Object> storedProcedureName,
        @Nullable Output<Map<String,StoredProcedureParameterArgs>> storedProcedureParameters,
        Output<String> type,
        @Nullable Output<List<UserPropertyArgs>> userProperties) {
        this.dependsOn = dependsOn;
        this.description = description;
        this.linkedServiceName = Objects.requireNonNull(linkedServiceName, "expected parameter 'linkedServiceName' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.policy = policy;
        this.storedProcedureName = Objects.requireNonNull(storedProcedureName, "expected parameter 'storedProcedureName' to be non-null");
        this.storedProcedureParameters = storedProcedureParameters;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userProperties = userProperties;
    }

    private SqlServerStoredProcedureActivityArgs() {
        this.dependsOn = Codegen.empty();
        this.description = Codegen.empty();
        this.linkedServiceName = Codegen.empty();
        this.name = Codegen.empty();
        this.policy = Codegen.empty();
        this.storedProcedureName = Codegen.empty();
        this.storedProcedureParameters = Codegen.empty();
        this.type = Codegen.empty();
        this.userProperties = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlServerStoredProcedureActivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ActivityDependencyArgs>> dependsOn;
        private @Nullable Output<String> description;
        private Output<LinkedServiceReferenceArgs> linkedServiceName;
        private Output<String> name;
        private @Nullable Output<ActivityPolicyArgs> policy;
        private Output<Object> storedProcedureName;
        private @Nullable Output<Map<String,StoredProcedureParameterArgs>> storedProcedureParameters;
        private Output<String> type;
        private @Nullable Output<List<UserPropertyArgs>> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlServerStoredProcedureActivityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
    	      this.storedProcedureName = defaults.storedProcedureName;
    	      this.storedProcedureParameters = defaults.storedProcedureParameters;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder dependsOn(@Nullable Output<List<ActivityDependencyArgs>> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }
        public Builder dependsOn(@Nullable List<ActivityDependencyArgs> dependsOn) {
            this.dependsOn = Codegen.ofNullable(dependsOn);
            return this;
        }
        public Builder dependsOn(ActivityDependencyArgs... dependsOn) {
            return dependsOn(List.of(dependsOn));
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder linkedServiceName(Output<LinkedServiceReferenceArgs> linkedServiceName) {
            this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
            return this;
        }
        public Builder linkedServiceName(LinkedServiceReferenceArgs linkedServiceName) {
            this.linkedServiceName = Output.of(Objects.requireNonNull(linkedServiceName));
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder policy(@Nullable Output<ActivityPolicyArgs> policy) {
            this.policy = policy;
            return this;
        }
        public Builder policy(@Nullable ActivityPolicyArgs policy) {
            this.policy = Codegen.ofNullable(policy);
            return this;
        }
        public Builder storedProcedureName(Output<Object> storedProcedureName) {
            this.storedProcedureName = Objects.requireNonNull(storedProcedureName);
            return this;
        }
        public Builder storedProcedureName(Object storedProcedureName) {
            this.storedProcedureName = Output.of(Objects.requireNonNull(storedProcedureName));
            return this;
        }
        public Builder storedProcedureParameters(@Nullable Output<Map<String,StoredProcedureParameterArgs>> storedProcedureParameters) {
            this.storedProcedureParameters = storedProcedureParameters;
            return this;
        }
        public Builder storedProcedureParameters(@Nullable Map<String,StoredProcedureParameterArgs> storedProcedureParameters) {
            this.storedProcedureParameters = Codegen.ofNullable(storedProcedureParameters);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder userProperties(@Nullable Output<List<UserPropertyArgs>> userProperties) {
            this.userProperties = userProperties;
            return this;
        }
        public Builder userProperties(@Nullable List<UserPropertyArgs> userProperties) {
            this.userProperties = Codegen.ofNullable(userProperties);
            return this;
        }
        public Builder userProperties(UserPropertyArgs... userProperties) {
            return userProperties(List.of(userProperties));
        }        public SqlServerStoredProcedureActivityArgs build() {
            return new SqlServerStoredProcedureActivityArgs(dependsOn, description, linkedServiceName, name, policy, storedProcedureName, storedProcedureParameters, type, userProperties);
        }
    }
}
