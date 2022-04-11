// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicediscovery.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class ServiceDnsConfigDnsRecordGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceDnsConfigDnsRecordGetArgs Empty = new ServiceDnsConfigDnsRecordGetArgs();

    /**
     * The amount of time, in seconds, that you want DNS resolvers to cache the settings for this resource record set.
     * 
     */
    @Import(name="ttl", required=true)
      private final Output<Integer> ttl;

    public Output<Integer> getTtl() {
        return this.ttl;
    }

    /**
     * The type of health check that you want to create, which indicates how Route 53 determines whether an endpoint is healthy. Valid Values: HTTP, HTTPS, TCP
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public ServiceDnsConfigDnsRecordGetArgs(
        Output<Integer> ttl,
        Output<String> type) {
        this.ttl = Objects.requireNonNull(ttl, "expected parameter 'ttl' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ServiceDnsConfigDnsRecordGetArgs() {
        this.ttl = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceDnsConfigDnsRecordGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> ttl;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceDnsConfigDnsRecordGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ttl = defaults.ttl;
    	      this.type = defaults.type;
        }

        public Builder ttl(Output<Integer> ttl) {
            this.ttl = Objects.requireNonNull(ttl);
            return this;
        }
        public Builder ttl(Integer ttl) {
            this.ttl = Output.of(Objects.requireNonNull(ttl));
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public ServiceDnsConfigDnsRecordGetArgs build() {
            return new ServiceDnsConfigDnsRecordGetArgs(ttl, type);
        }
    }
}
