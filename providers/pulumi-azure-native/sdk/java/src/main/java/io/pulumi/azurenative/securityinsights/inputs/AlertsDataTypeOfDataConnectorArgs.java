// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.azurenative.securityinsights.inputs.DataConnectorDataTypeCommonArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Alerts data type for data connectors.
 * 
 */
public final class AlertsDataTypeOfDataConnectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final AlertsDataTypeOfDataConnectorArgs Empty = new AlertsDataTypeOfDataConnectorArgs();

    /**
     * Alerts data type connection.
     * 
     */
    @InputImport(name="alerts")
      private final @Nullable Input<DataConnectorDataTypeCommonArgs> alerts;

    public Input<DataConnectorDataTypeCommonArgs> getAlerts() {
        return this.alerts == null ? Input.empty() : this.alerts;
    }

    public AlertsDataTypeOfDataConnectorArgs(@Nullable Input<DataConnectorDataTypeCommonArgs> alerts) {
        this.alerts = alerts;
    }

    private AlertsDataTypeOfDataConnectorArgs() {
        this.alerts = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertsDataTypeOfDataConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DataConnectorDataTypeCommonArgs> alerts;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertsDataTypeOfDataConnectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alerts = defaults.alerts;
        }

        public Builder alerts(@Nullable Input<DataConnectorDataTypeCommonArgs> alerts) {
            this.alerts = alerts;
            return this;
        }

        public Builder alerts(@Nullable DataConnectorDataTypeCommonArgs alerts) {
            this.alerts = Input.ofNullable(alerts);
            return this;
        }
        public AlertsDataTypeOfDataConnectorArgs build() {
            return new AlertsDataTypeOfDataConnectorArgs(alerts);
        }
    }
}
