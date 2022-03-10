// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.ActivityDependencyArgs;
import io.pulumi.azurenative.datafactory.inputs.AppendVariableActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureDataExplorerCommandActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureFunctionActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureMLBatchExecutionActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureMLExecutePipelineActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureMLUpdateResourceActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.ControlActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.CopyActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.CustomActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.DataLakeAnalyticsUSQLActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.DatabricksNotebookActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.DatabricksSparkJarActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.DatabricksSparkPythonActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.DeleteActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.ExecuteDataFlowActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.ExecutePipelineActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.ExecuteSSISPackageActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.ExecuteWranglingDataflowActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.ExecutionActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.ExpressionArgs;
import io.pulumi.azurenative.datafactory.inputs.FailActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.FilterActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.ForEachActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.GetMetadataActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.HDInsightHiveActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.HDInsightMapReduceActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.HDInsightPigActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.HDInsightSparkActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.HDInsightStreamingActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.LookupActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.SetVariableActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.SqlServerStoredProcedureActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.SwitchActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.UntilActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.UserPropertyArgs;
import io.pulumi.azurenative.datafactory.inputs.ValidationActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.WaitActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.WebActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.WebHookActivityArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * This activity evaluates a boolean expression and executes either the activities under the ifTrueActivities property or the ifFalseActivities property depending on the result of the expression.
 * 
 */
public final class IfConditionActivityArgs extends io.pulumi.resources.ResourceArgs {

    public static final IfConditionActivityArgs Empty = new IfConditionActivityArgs();

    /**
     * Activity depends on condition.
     * 
     */
    @InputImport(name="dependsOn")
      private final @Nullable Input<List<ActivityDependencyArgs>> dependsOn;

    public Input<List<ActivityDependencyArgs>> getDependsOn() {
        return this.dependsOn == null ? Input.empty() : this.dependsOn;
    }

    /**
     * Activity description.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * An expression that would evaluate to Boolean. This is used to determine the block of activities (ifTrueActivities or ifFalseActivities) that will be executed.
     * 
     */
    @InputImport(name="expression", required=true)
      private final Input<ExpressionArgs> expression;

    public Input<ExpressionArgs> getExpression() {
        return this.expression;
    }

    /**
     * List of activities to execute if expression is evaluated to false. This is an optional property and if not provided, the activity will exit without any action.
     * 
     */
    @InputImport(name="ifFalseActivities")
      private final @Nullable Input<List<Object>> ifFalseActivities;

    public Input<List<Object>> getIfFalseActivities() {
        return this.ifFalseActivities == null ? Input.empty() : this.ifFalseActivities;
    }

    /**
     * List of activities to execute if expression is evaluated to true. This is an optional property and if not provided, the activity will exit without any action.
     * 
     */
    @InputImport(name="ifTrueActivities")
      private final @Nullable Input<List<Object>> ifTrueActivities;

    public Input<List<Object>> getIfTrueActivities() {
        return this.ifTrueActivities == null ? Input.empty() : this.ifTrueActivities;
    }

    /**
     * Activity name.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Type of activity.
     * Expected value is 'IfCondition'.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * Activity user properties.
     * 
     */
    @InputImport(name="userProperties")
      private final @Nullable Input<List<UserPropertyArgs>> userProperties;

    public Input<List<UserPropertyArgs>> getUserProperties() {
        return this.userProperties == null ? Input.empty() : this.userProperties;
    }

    public IfConditionActivityArgs(
        @Nullable Input<List<ActivityDependencyArgs>> dependsOn,
        @Nullable Input<String> description,
        Input<ExpressionArgs> expression,
        @Nullable Input<List<Object>> ifFalseActivities,
        @Nullable Input<List<Object>> ifTrueActivities,
        Input<String> name,
        Input<String> type,
        @Nullable Input<List<UserPropertyArgs>> userProperties) {
        this.dependsOn = dependsOn;
        this.description = description;
        this.expression = Objects.requireNonNull(expression, "expected parameter 'expression' to be non-null");
        this.ifFalseActivities = ifFalseActivities;
        this.ifTrueActivities = ifTrueActivities;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userProperties = userProperties;
    }

    private IfConditionActivityArgs() {
        this.dependsOn = Input.empty();
        this.description = Input.empty();
        this.expression = Input.empty();
        this.ifFalseActivities = Input.empty();
        this.ifTrueActivities = Input.empty();
        this.name = Input.empty();
        this.type = Input.empty();
        this.userProperties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IfConditionActivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ActivityDependencyArgs>> dependsOn;
        private @Nullable Input<String> description;
        private Input<ExpressionArgs> expression;
        private @Nullable Input<List<Object>> ifFalseActivities;
        private @Nullable Input<List<Object>> ifTrueActivities;
        private Input<String> name;
        private Input<String> type;
        private @Nullable Input<List<UserPropertyArgs>> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(IfConditionActivityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.expression = defaults.expression;
    	      this.ifFalseActivities = defaults.ifFalseActivities;
    	      this.ifTrueActivities = defaults.ifTrueActivities;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder dependsOn(@Nullable Input<List<ActivityDependencyArgs>> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }

        public Builder dependsOn(@Nullable List<ActivityDependencyArgs> dependsOn) {
            this.dependsOn = Input.ofNullable(dependsOn);
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder expression(Input<ExpressionArgs> expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }

        public Builder expression(ExpressionArgs expression) {
            this.expression = Input.of(Objects.requireNonNull(expression));
            return this;
        }

        public Builder ifFalseActivities(@Nullable Input<List<Object>> ifFalseActivities) {
            this.ifFalseActivities = ifFalseActivities;
            return this;
        }

        public Builder ifFalseActivities(@Nullable List<Object> ifFalseActivities) {
            this.ifFalseActivities = Input.ofNullable(ifFalseActivities);
            return this;
        }

        public Builder ifTrueActivities(@Nullable Input<List<Object>> ifTrueActivities) {
            this.ifTrueActivities = ifTrueActivities;
            return this;
        }

        public Builder ifTrueActivities(@Nullable List<Object> ifTrueActivities) {
            this.ifTrueActivities = Input.ofNullable(ifTrueActivities);
            return this;
        }

        public Builder name(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder type(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder userProperties(@Nullable Input<List<UserPropertyArgs>> userProperties) {
            this.userProperties = userProperties;
            return this;
        }

        public Builder userProperties(@Nullable List<UserPropertyArgs> userProperties) {
            this.userProperties = Input.ofNullable(userProperties);
            return this;
        }
        public IfConditionActivityArgs build() {
            return new IfConditionActivityArgs(dependsOn, description, expression, ifFalseActivities, ifTrueActivities, name, type, userProperties);
        }
    }
}
