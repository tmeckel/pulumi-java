// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elb.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LoadBalancerListenerGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoadBalancerListenerGetArgs Empty = new LoadBalancerListenerGetArgs();

    /**
     * The port on the instance to route to
     * 
     */
    @InputImport(name="instancePort", required=true)
      private final Input<Integer> instancePort;

    public Input<Integer> getInstancePort() {
        return this.instancePort;
    }

    /**
     * The protocol to use to the instance. Valid
     * values are `HTTP`, `HTTPS`, `TCP`, or `SSL`
     * 
     */
    @InputImport(name="instanceProtocol", required=true)
      private final Input<String> instanceProtocol;

    public Input<String> getInstanceProtocol() {
        return this.instanceProtocol;
    }

    /**
     * The port to listen on for the load balancer
     * 
     */
    @InputImport(name="lbPort", required=true)
      private final Input<Integer> lbPort;

    public Input<Integer> getLbPort() {
        return this.lbPort;
    }

    /**
     * The protocol to listen on. Valid values are `HTTP`,
     * `HTTPS`, `TCP`, or `SSL`
     * 
     */
    @InputImport(name="lbProtocol", required=true)
      private final Input<String> lbProtocol;

    public Input<String> getLbProtocol() {
        return this.lbProtocol;
    }

    /**
     * The ARN of an SSL certificate you have
     * uploaded to AWS IAM. **Note ECDSA-specific restrictions below.  Only valid when `lb_protocol` is either HTTPS or SSL**
     * 
     */
    @InputImport(name="sslCertificateId")
      private final @Nullable Input<String> sslCertificateId;

    public Input<String> getSslCertificateId() {
        return this.sslCertificateId == null ? Input.empty() : this.sslCertificateId;
    }

    public LoadBalancerListenerGetArgs(
        Input<Integer> instancePort,
        Input<String> instanceProtocol,
        Input<Integer> lbPort,
        Input<String> lbProtocol,
        @Nullable Input<String> sslCertificateId) {
        this.instancePort = Objects.requireNonNull(instancePort, "expected parameter 'instancePort' to be non-null");
        this.instanceProtocol = Objects.requireNonNull(instanceProtocol, "expected parameter 'instanceProtocol' to be non-null");
        this.lbPort = Objects.requireNonNull(lbPort, "expected parameter 'lbPort' to be non-null");
        this.lbProtocol = Objects.requireNonNull(lbProtocol, "expected parameter 'lbProtocol' to be non-null");
        this.sslCertificateId = sslCertificateId;
    }

    private LoadBalancerListenerGetArgs() {
        this.instancePort = Input.empty();
        this.instanceProtocol = Input.empty();
        this.lbPort = Input.empty();
        this.lbProtocol = Input.empty();
        this.sslCertificateId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerListenerGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> instancePort;
        private Input<String> instanceProtocol;
        private Input<Integer> lbPort;
        private Input<String> lbProtocol;
        private @Nullable Input<String> sslCertificateId;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerListenerGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instancePort = defaults.instancePort;
    	      this.instanceProtocol = defaults.instanceProtocol;
    	      this.lbPort = defaults.lbPort;
    	      this.lbProtocol = defaults.lbProtocol;
    	      this.sslCertificateId = defaults.sslCertificateId;
        }

        public Builder instancePort(Input<Integer> instancePort) {
            this.instancePort = Objects.requireNonNull(instancePort);
            return this;
        }

        public Builder instancePort(Integer instancePort) {
            this.instancePort = Input.of(Objects.requireNonNull(instancePort));
            return this;
        }

        public Builder instanceProtocol(Input<String> instanceProtocol) {
            this.instanceProtocol = Objects.requireNonNull(instanceProtocol);
            return this;
        }

        public Builder instanceProtocol(String instanceProtocol) {
            this.instanceProtocol = Input.of(Objects.requireNonNull(instanceProtocol));
            return this;
        }

        public Builder lbPort(Input<Integer> lbPort) {
            this.lbPort = Objects.requireNonNull(lbPort);
            return this;
        }

        public Builder lbPort(Integer lbPort) {
            this.lbPort = Input.of(Objects.requireNonNull(lbPort));
            return this;
        }

        public Builder lbProtocol(Input<String> lbProtocol) {
            this.lbProtocol = Objects.requireNonNull(lbProtocol);
            return this;
        }

        public Builder lbProtocol(String lbProtocol) {
            this.lbProtocol = Input.of(Objects.requireNonNull(lbProtocol));
            return this;
        }

        public Builder sslCertificateId(@Nullable Input<String> sslCertificateId) {
            this.sslCertificateId = sslCertificateId;
            return this;
        }

        public Builder sslCertificateId(@Nullable String sslCertificateId) {
            this.sslCertificateId = Input.ofNullable(sslCertificateId);
            return this;
        }
        public LoadBalancerListenerGetArgs build() {
            return new LoadBalancerListenerGetArgs(instancePort, instanceProtocol, lbPort, lbProtocol, sslCertificateId);
        }
    }
}
