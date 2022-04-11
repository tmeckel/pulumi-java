// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class UserPoolAccountRecoverySettingRecoveryMechanismGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserPoolAccountRecoverySettingRecoveryMechanismGetArgs Empty = new UserPoolAccountRecoverySettingRecoveryMechanismGetArgs();

    /**
     * Name of the attribute.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * Positive integer specifying priority of a method with 1 being the highest priority.
     * 
     */
    @Import(name="priority", required=true)
      private final Output<Integer> priority;

    public Output<Integer> getPriority() {
        return this.priority;
    }

    public UserPoolAccountRecoverySettingRecoveryMechanismGetArgs(
        Output<String> name,
        Output<Integer> priority) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
    }

    private UserPoolAccountRecoverySettingRecoveryMechanismGetArgs() {
        this.name = Codegen.empty();
        this.priority = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolAccountRecoverySettingRecoveryMechanismGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;
        private Output<Integer> priority;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPoolAccountRecoverySettingRecoveryMechanismGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder priority(Output<Integer> priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder priority(Integer priority) {
            this.priority = Output.of(Objects.requireNonNull(priority));
            return this;
        }        public UserPoolAccountRecoverySettingRecoveryMechanismGetArgs build() {
            return new UserPoolAccountRecoverySettingRecoveryMechanismGetArgs(name, priority);
        }
    }
}
