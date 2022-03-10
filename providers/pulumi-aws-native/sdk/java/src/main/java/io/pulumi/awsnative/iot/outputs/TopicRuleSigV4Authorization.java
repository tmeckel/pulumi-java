// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class TopicRuleSigV4Authorization {
    private final String roleArn;
    private final String serviceName;
    private final String signingRegion;

    @OutputCustomType.Constructor
    private TopicRuleSigV4Authorization(
        @OutputCustomType.Parameter("roleArn") String roleArn,
        @OutputCustomType.Parameter("serviceName") String serviceName,
        @OutputCustomType.Parameter("signingRegion") String signingRegion) {
        this.roleArn = roleArn;
        this.serviceName = serviceName;
        this.signingRegion = signingRegion;
    }

    public String getRoleArn() {
        return this.roleArn;
    }
    public String getServiceName() {
        return this.serviceName;
    }
    public String getSigningRegion() {
        return this.signingRegion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleSigV4Authorization defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String roleArn;
        private String serviceName;
        private String signingRegion;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleSigV4Authorization defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.roleArn = defaults.roleArn;
    	      this.serviceName = defaults.serviceName;
    	      this.signingRegion = defaults.signingRegion;
        }

        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder signingRegion(String signingRegion) {
            this.signingRegion = Objects.requireNonNull(signingRegion);
            return this;
        }
        public TopicRuleSigV4Authorization build() {
            return new TopicRuleSigV4Authorization(roleArn, serviceName, signingRegion);
        }
    }
}
