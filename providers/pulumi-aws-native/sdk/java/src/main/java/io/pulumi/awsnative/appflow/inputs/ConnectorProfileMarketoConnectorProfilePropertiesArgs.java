// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class ConnectorProfileMarketoConnectorProfilePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorProfileMarketoConnectorProfilePropertiesArgs Empty = new ConnectorProfileMarketoConnectorProfilePropertiesArgs();

    /**
     * The location of the Marketo resource
     * 
     */
    @Import(name="instanceUrl", required=true)
      private final Output<String> instanceUrl;

    public Output<String> getInstanceUrl() {
        return this.instanceUrl;
    }

    public ConnectorProfileMarketoConnectorProfilePropertiesArgs(Output<String> instanceUrl) {
        this.instanceUrl = Objects.requireNonNull(instanceUrl, "expected parameter 'instanceUrl' to be non-null");
    }

    private ConnectorProfileMarketoConnectorProfilePropertiesArgs() {
        this.instanceUrl = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileMarketoConnectorProfilePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> instanceUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileMarketoConnectorProfilePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceUrl = defaults.instanceUrl;
        }

        public Builder instanceUrl(Output<String> instanceUrl) {
            this.instanceUrl = Objects.requireNonNull(instanceUrl);
            return this;
        }
        public Builder instanceUrl(String instanceUrl) {
            this.instanceUrl = Output.of(Objects.requireNonNull(instanceUrl));
            return this;
        }        public ConnectorProfileMarketoConnectorProfilePropertiesArgs build() {
            return new ConnectorProfileMarketoConnectorProfilePropertiesArgs(instanceUrl);
        }
    }
}
