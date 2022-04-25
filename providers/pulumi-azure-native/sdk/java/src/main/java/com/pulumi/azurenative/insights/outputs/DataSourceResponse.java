// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.azurenative.insights.outputs.DataSourceConfigurationResponse;
import com.pulumi.azurenative.insights.outputs.SinkConfigurationResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class DataSourceResponse {
    private final DataSourceConfigurationResponse configuration;
    /**
     * @return Datasource kind
     * 
     */
    private final String kind;
    private final List<SinkConfigurationResponse> sinks;

    @CustomType.Constructor
    private DataSourceResponse(
        @CustomType.Parameter("configuration") DataSourceConfigurationResponse configuration,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("sinks") List<SinkConfigurationResponse> sinks) {
        this.configuration = configuration;
        this.kind = kind;
        this.sinks = sinks;
    }

    public DataSourceConfigurationResponse configuration() {
        return this.configuration;
    }
    /**
     * @return Datasource kind
     * 
     */
    public String kind() {
        return this.kind;
    }
    public List<SinkConfigurationResponse> sinks() {
        return this.sinks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceConfigurationResponse configuration;
        private String kind;
        private List<SinkConfigurationResponse> sinks;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configuration = defaults.configuration;
    	      this.kind = defaults.kind;
    	      this.sinks = defaults.sinks;
        }

        public Builder configuration(DataSourceConfigurationResponse configuration) {
            this.configuration = Objects.requireNonNull(configuration);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder sinks(List<SinkConfigurationResponse> sinks) {
            this.sinks = Objects.requireNonNull(sinks);
            return this;
        }
        public Builder sinks(SinkConfigurationResponse... sinks) {
            return sinks(List.of(sinks));
        }        public DataSourceResponse build() {
            return new DataSourceResponse(configuration, kind, sinks);
        }
    }
}
