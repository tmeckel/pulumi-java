// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.awsnative.appflow.inputs.FlowEventBridgeDestinationPropertiesArgs;
import io.pulumi.awsnative.appflow.inputs.FlowLookoutMetricsDestinationPropertiesArgs;
import io.pulumi.awsnative.appflow.inputs.FlowRedshiftDestinationPropertiesArgs;
import io.pulumi.awsnative.appflow.inputs.FlowS3DestinationPropertiesArgs;
import io.pulumi.awsnative.appflow.inputs.FlowSalesforceDestinationPropertiesArgs;
import io.pulumi.awsnative.appflow.inputs.FlowSnowflakeDestinationPropertiesArgs;
import io.pulumi.awsnative.appflow.inputs.FlowUpsolverDestinationPropertiesArgs;
import io.pulumi.awsnative.appflow.inputs.FlowZendeskDestinationPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Destination connector details
 * 
 */
public final class FlowDestinationConnectorPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowDestinationConnectorPropertiesArgs Empty = new FlowDestinationConnectorPropertiesArgs();

    @Import(name="eventBridge")
      private final @Nullable Output<FlowEventBridgeDestinationPropertiesArgs> eventBridge;

    public Output<FlowEventBridgeDestinationPropertiesArgs> getEventBridge() {
        return this.eventBridge == null ? Codegen.empty() : this.eventBridge;
    }

    @Import(name="lookoutMetrics")
      private final @Nullable Output<FlowLookoutMetricsDestinationPropertiesArgs> lookoutMetrics;

    public Output<FlowLookoutMetricsDestinationPropertiesArgs> getLookoutMetrics() {
        return this.lookoutMetrics == null ? Codegen.empty() : this.lookoutMetrics;
    }

    @Import(name="redshift")
      private final @Nullable Output<FlowRedshiftDestinationPropertiesArgs> redshift;

    public Output<FlowRedshiftDestinationPropertiesArgs> getRedshift() {
        return this.redshift == null ? Codegen.empty() : this.redshift;
    }

    @Import(name="s3")
      private final @Nullable Output<FlowS3DestinationPropertiesArgs> s3;

    public Output<FlowS3DestinationPropertiesArgs> getS3() {
        return this.s3 == null ? Codegen.empty() : this.s3;
    }

    @Import(name="salesforce")
      private final @Nullable Output<FlowSalesforceDestinationPropertiesArgs> salesforce;

    public Output<FlowSalesforceDestinationPropertiesArgs> getSalesforce() {
        return this.salesforce == null ? Codegen.empty() : this.salesforce;
    }

    @Import(name="snowflake")
      private final @Nullable Output<FlowSnowflakeDestinationPropertiesArgs> snowflake;

    public Output<FlowSnowflakeDestinationPropertiesArgs> getSnowflake() {
        return this.snowflake == null ? Codegen.empty() : this.snowflake;
    }

    @Import(name="upsolver")
      private final @Nullable Output<FlowUpsolverDestinationPropertiesArgs> upsolver;

    public Output<FlowUpsolverDestinationPropertiesArgs> getUpsolver() {
        return this.upsolver == null ? Codegen.empty() : this.upsolver;
    }

    @Import(name="zendesk")
      private final @Nullable Output<FlowZendeskDestinationPropertiesArgs> zendesk;

    public Output<FlowZendeskDestinationPropertiesArgs> getZendesk() {
        return this.zendesk == null ? Codegen.empty() : this.zendesk;
    }

    public FlowDestinationConnectorPropertiesArgs(
        @Nullable Output<FlowEventBridgeDestinationPropertiesArgs> eventBridge,
        @Nullable Output<FlowLookoutMetricsDestinationPropertiesArgs> lookoutMetrics,
        @Nullable Output<FlowRedshiftDestinationPropertiesArgs> redshift,
        @Nullable Output<FlowS3DestinationPropertiesArgs> s3,
        @Nullable Output<FlowSalesforceDestinationPropertiesArgs> salesforce,
        @Nullable Output<FlowSnowflakeDestinationPropertiesArgs> snowflake,
        @Nullable Output<FlowUpsolverDestinationPropertiesArgs> upsolver,
        @Nullable Output<FlowZendeskDestinationPropertiesArgs> zendesk) {
        this.eventBridge = eventBridge;
        this.lookoutMetrics = lookoutMetrics;
        this.redshift = redshift;
        this.s3 = s3;
        this.salesforce = salesforce;
        this.snowflake = snowflake;
        this.upsolver = upsolver;
        this.zendesk = zendesk;
    }

    private FlowDestinationConnectorPropertiesArgs() {
        this.eventBridge = Codegen.empty();
        this.lookoutMetrics = Codegen.empty();
        this.redshift = Codegen.empty();
        this.s3 = Codegen.empty();
        this.salesforce = Codegen.empty();
        this.snowflake = Codegen.empty();
        this.upsolver = Codegen.empty();
        this.zendesk = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowDestinationConnectorPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<FlowEventBridgeDestinationPropertiesArgs> eventBridge;
        private @Nullable Output<FlowLookoutMetricsDestinationPropertiesArgs> lookoutMetrics;
        private @Nullable Output<FlowRedshiftDestinationPropertiesArgs> redshift;
        private @Nullable Output<FlowS3DestinationPropertiesArgs> s3;
        private @Nullable Output<FlowSalesforceDestinationPropertiesArgs> salesforce;
        private @Nullable Output<FlowSnowflakeDestinationPropertiesArgs> snowflake;
        private @Nullable Output<FlowUpsolverDestinationPropertiesArgs> upsolver;
        private @Nullable Output<FlowZendeskDestinationPropertiesArgs> zendesk;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowDestinationConnectorPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventBridge = defaults.eventBridge;
    	      this.lookoutMetrics = defaults.lookoutMetrics;
    	      this.redshift = defaults.redshift;
    	      this.s3 = defaults.s3;
    	      this.salesforce = defaults.salesforce;
    	      this.snowflake = defaults.snowflake;
    	      this.upsolver = defaults.upsolver;
    	      this.zendesk = defaults.zendesk;
        }

        public Builder eventBridge(@Nullable Output<FlowEventBridgeDestinationPropertiesArgs> eventBridge) {
            this.eventBridge = eventBridge;
            return this;
        }
        public Builder eventBridge(@Nullable FlowEventBridgeDestinationPropertiesArgs eventBridge) {
            this.eventBridge = Codegen.ofNullable(eventBridge);
            return this;
        }
        public Builder lookoutMetrics(@Nullable Output<FlowLookoutMetricsDestinationPropertiesArgs> lookoutMetrics) {
            this.lookoutMetrics = lookoutMetrics;
            return this;
        }
        public Builder lookoutMetrics(@Nullable FlowLookoutMetricsDestinationPropertiesArgs lookoutMetrics) {
            this.lookoutMetrics = Codegen.ofNullable(lookoutMetrics);
            return this;
        }
        public Builder redshift(@Nullable Output<FlowRedshiftDestinationPropertiesArgs> redshift) {
            this.redshift = redshift;
            return this;
        }
        public Builder redshift(@Nullable FlowRedshiftDestinationPropertiesArgs redshift) {
            this.redshift = Codegen.ofNullable(redshift);
            return this;
        }
        public Builder s3(@Nullable Output<FlowS3DestinationPropertiesArgs> s3) {
            this.s3 = s3;
            return this;
        }
        public Builder s3(@Nullable FlowS3DestinationPropertiesArgs s3) {
            this.s3 = Codegen.ofNullable(s3);
            return this;
        }
        public Builder salesforce(@Nullable Output<FlowSalesforceDestinationPropertiesArgs> salesforce) {
            this.salesforce = salesforce;
            return this;
        }
        public Builder salesforce(@Nullable FlowSalesforceDestinationPropertiesArgs salesforce) {
            this.salesforce = Codegen.ofNullable(salesforce);
            return this;
        }
        public Builder snowflake(@Nullable Output<FlowSnowflakeDestinationPropertiesArgs> snowflake) {
            this.snowflake = snowflake;
            return this;
        }
        public Builder snowflake(@Nullable FlowSnowflakeDestinationPropertiesArgs snowflake) {
            this.snowflake = Codegen.ofNullable(snowflake);
            return this;
        }
        public Builder upsolver(@Nullable Output<FlowUpsolverDestinationPropertiesArgs> upsolver) {
            this.upsolver = upsolver;
            return this;
        }
        public Builder upsolver(@Nullable FlowUpsolverDestinationPropertiesArgs upsolver) {
            this.upsolver = Codegen.ofNullable(upsolver);
            return this;
        }
        public Builder zendesk(@Nullable Output<FlowZendeskDestinationPropertiesArgs> zendesk) {
            this.zendesk = zendesk;
            return this;
        }
        public Builder zendesk(@Nullable FlowZendeskDestinationPropertiesArgs zendesk) {
            this.zendesk = Codegen.ofNullable(zendesk);
            return this;
        }        public FlowDestinationConnectorPropertiesArgs build() {
            return new FlowDestinationConnectorPropertiesArgs(eventBridge, lookoutMetrics, redshift, s3, salesforce, snowflake, upsolver, zendesk);
        }
    }
}
