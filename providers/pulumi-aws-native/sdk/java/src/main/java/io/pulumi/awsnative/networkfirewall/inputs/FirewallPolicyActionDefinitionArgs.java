// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.inputs;

import io.pulumi.awsnative.networkfirewall.inputs.FirewallPolicyPublishMetricActionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallPolicyActionDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyActionDefinitionArgs Empty = new FirewallPolicyActionDefinitionArgs();

    @InputImport(name="publishMetricAction")
      private final @Nullable Input<FirewallPolicyPublishMetricActionArgs> publishMetricAction;

    public Input<FirewallPolicyPublishMetricActionArgs> getPublishMetricAction() {
        return this.publishMetricAction == null ? Input.empty() : this.publishMetricAction;
    }

    public FirewallPolicyActionDefinitionArgs(@Nullable Input<FirewallPolicyPublishMetricActionArgs> publishMetricAction) {
        this.publishMetricAction = publishMetricAction;
    }

    private FirewallPolicyActionDefinitionArgs() {
        this.publishMetricAction = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyActionDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<FirewallPolicyPublishMetricActionArgs> publishMetricAction;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyActionDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publishMetricAction = defaults.publishMetricAction;
        }

        public Builder publishMetricAction(@Nullable Input<FirewallPolicyPublishMetricActionArgs> publishMetricAction) {
            this.publishMetricAction = publishMetricAction;
            return this;
        }

        public Builder publishMetricAction(@Nullable FirewallPolicyPublishMetricActionArgs publishMetricAction) {
            this.publishMetricAction = Input.ofNullable(publishMetricAction);
            return this;
        }
        public FirewallPolicyActionDefinitionArgs build() {
            return new FirewallPolicyActionDefinitionArgs(publishMetricAction);
        }
    }
}
