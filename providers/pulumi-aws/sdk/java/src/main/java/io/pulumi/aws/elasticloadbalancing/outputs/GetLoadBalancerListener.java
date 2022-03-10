// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticloadbalancing.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetLoadBalancerListener {
    private final Integer instancePort;
    private final String instanceProtocol;
    private final Integer lbPort;
    private final String lbProtocol;
    private final String sslCertificateId;

    @OutputCustomType.Constructor
    private GetLoadBalancerListener(
        @OutputCustomType.Parameter("instancePort") Integer instancePort,
        @OutputCustomType.Parameter("instanceProtocol") String instanceProtocol,
        @OutputCustomType.Parameter("lbPort") Integer lbPort,
        @OutputCustomType.Parameter("lbProtocol") String lbProtocol,
        @OutputCustomType.Parameter("sslCertificateId") String sslCertificateId) {
        this.instancePort = instancePort;
        this.instanceProtocol = instanceProtocol;
        this.lbPort = lbPort;
        this.lbProtocol = lbProtocol;
        this.sslCertificateId = sslCertificateId;
    }

    public Integer getInstancePort() {
        return this.instancePort;
    }
    public String getInstanceProtocol() {
        return this.instanceProtocol;
    }
    public Integer getLbPort() {
        return this.lbPort;
    }
    public String getLbProtocol() {
        return this.lbProtocol;
    }
    public String getSslCertificateId() {
        return this.sslCertificateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoadBalancerListener defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer instancePort;
        private String instanceProtocol;
        private Integer lbPort;
        private String lbProtocol;
        private String sslCertificateId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLoadBalancerListener defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instancePort = defaults.instancePort;
    	      this.instanceProtocol = defaults.instanceProtocol;
    	      this.lbPort = defaults.lbPort;
    	      this.lbProtocol = defaults.lbProtocol;
    	      this.sslCertificateId = defaults.sslCertificateId;
        }

        public Builder instancePort(Integer instancePort) {
            this.instancePort = Objects.requireNonNull(instancePort);
            return this;
        }

        public Builder instanceProtocol(String instanceProtocol) {
            this.instanceProtocol = Objects.requireNonNull(instanceProtocol);
            return this;
        }

        public Builder lbPort(Integer lbPort) {
            this.lbPort = Objects.requireNonNull(lbPort);
            return this;
        }

        public Builder lbProtocol(String lbProtocol) {
            this.lbProtocol = Objects.requireNonNull(lbProtocol);
            return this;
        }

        public Builder sslCertificateId(String sslCertificateId) {
            this.sslCertificateId = Objects.requireNonNull(sslCertificateId);
            return this;
        }
        public GetLoadBalancerListener build() {
            return new GetLoadBalancerListener(instancePort, instanceProtocol, lbPort, lbProtocol, sslCertificateId);
        }
    }
}
