// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.alb.inputs;

import io.pulumi.aws.alb.inputs.ListenerDefaultActionGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerState extends io.pulumi.resources.ResourceArgs {

    public static final ListenerState Empty = new ListenerState();

    /**
     * Name of the Application-Layer Protocol Negotiation (ALPN) policy. Can be set if `protocol` is `TLS`. Valid values are `HTTP1Only`, `HTTP2Only`, `HTTP2Optional`, `HTTP2Preferred`, and `None`.
     * 
     */
    @InputImport(name="alpnPolicy")
      private final @Nullable Input<String> alpnPolicy;

    public Input<String> getAlpnPolicy() {
        return this.alpnPolicy == null ? Input.empty() : this.alpnPolicy;
    }

    /**
     * ARN of the target group.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * ARN of the default SSL server certificate. Exactly one certificate is required if the protocol is HTTPS. For adding additional SSL certificates, see the `aws.lb.ListenerCertificate` resource.
     * 
     */
    @InputImport(name="certificateArn")
      private final @Nullable Input<String> certificateArn;

    public Input<String> getCertificateArn() {
        return this.certificateArn == null ? Input.empty() : this.certificateArn;
    }

    /**
     * Configuration block for default actions. Detailed below.
     * 
     */
    @InputImport(name="defaultActions")
      private final @Nullable Input<List<ListenerDefaultActionGetArgs>> defaultActions;

    public Input<List<ListenerDefaultActionGetArgs>> getDefaultActions() {
        return this.defaultActions == null ? Input.empty() : this.defaultActions;
    }

    /**
     * ARN of the load balancer.
     * 
     */
    @InputImport(name="loadBalancerArn")
      private final @Nullable Input<String> loadBalancerArn;

    public Input<String> getLoadBalancerArn() {
        return this.loadBalancerArn == null ? Input.empty() : this.loadBalancerArn;
    }

    /**
     * Port. Specify a value from `1` to `65535` or `#{port}`. Defaults to `#{port}`.
     * 
     */
    @InputImport(name="port")
      private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    /**
     * Protocol. Valid values are `HTTP`, `HTTPS`, or `#{protocol}`. Defaults to `#{protocol}`.
     * 
     */
    @InputImport(name="protocol")
      private final @Nullable Input<String> protocol;

    public Input<String> getProtocol() {
        return this.protocol == null ? Input.empty() : this.protocol;
    }

    /**
     * Name of the SSL Policy for the listener. Required if `protocol` is `HTTPS` or `TLS`.
     * 
     */
    @InputImport(name="sslPolicy")
      private final @Nullable Input<String> sslPolicy;

    public Input<String> getSslPolicy() {
        return this.sslPolicy == null ? Input.empty() : this.sslPolicy;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    public ListenerState(
        @Nullable Input<String> alpnPolicy,
        @Nullable Input<String> arn,
        @Nullable Input<String> certificateArn,
        @Nullable Input<List<ListenerDefaultActionGetArgs>> defaultActions,
        @Nullable Input<String> loadBalancerArn,
        @Nullable Input<Integer> port,
        @Nullable Input<String> protocol,
        @Nullable Input<String> sslPolicy,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll) {
        this.alpnPolicy = alpnPolicy;
        this.arn = arn;
        this.certificateArn = certificateArn;
        this.defaultActions = defaultActions;
        this.loadBalancerArn = loadBalancerArn;
        this.port = port;
        this.protocol = protocol;
        this.sslPolicy = sslPolicy;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private ListenerState() {
        this.alpnPolicy = Input.empty();
        this.arn = Input.empty();
        this.certificateArn = Input.empty();
        this.defaultActions = Input.empty();
        this.loadBalancerArn = Input.empty();
        this.port = Input.empty();
        this.protocol = Input.empty();
        this.sslPolicy = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> alpnPolicy;
        private @Nullable Input<String> arn;
        private @Nullable Input<String> certificateArn;
        private @Nullable Input<List<ListenerDefaultActionGetArgs>> defaultActions;
        private @Nullable Input<String> loadBalancerArn;
        private @Nullable Input<Integer> port;
        private @Nullable Input<String> protocol;
        private @Nullable Input<String> sslPolicy;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alpnPolicy = defaults.alpnPolicy;
    	      this.arn = defaults.arn;
    	      this.certificateArn = defaults.certificateArn;
    	      this.defaultActions = defaults.defaultActions;
    	      this.loadBalancerArn = defaults.loadBalancerArn;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
    	      this.sslPolicy = defaults.sslPolicy;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder alpnPolicy(@Nullable Input<String> alpnPolicy) {
            this.alpnPolicy = alpnPolicy;
            return this;
        }

        public Builder alpnPolicy(@Nullable String alpnPolicy) {
            this.alpnPolicy = Input.ofNullable(alpnPolicy);
            return this;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder certificateArn(@Nullable Input<String> certificateArn) {
            this.certificateArn = certificateArn;
            return this;
        }

        public Builder certificateArn(@Nullable String certificateArn) {
            this.certificateArn = Input.ofNullable(certificateArn);
            return this;
        }

        public Builder defaultActions(@Nullable Input<List<ListenerDefaultActionGetArgs>> defaultActions) {
            this.defaultActions = defaultActions;
            return this;
        }

        public Builder defaultActions(@Nullable List<ListenerDefaultActionGetArgs> defaultActions) {
            this.defaultActions = Input.ofNullable(defaultActions);
            return this;
        }

        public Builder loadBalancerArn(@Nullable Input<String> loadBalancerArn) {
            this.loadBalancerArn = loadBalancerArn;
            return this;
        }

        public Builder loadBalancerArn(@Nullable String loadBalancerArn) {
            this.loadBalancerArn = Input.ofNullable(loadBalancerArn);
            return this;
        }

        public Builder port(@Nullable Input<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder port(@Nullable Integer port) {
            this.port = Input.ofNullable(port);
            return this;
        }

        public Builder protocol(@Nullable Input<String> protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder protocol(@Nullable String protocol) {
            this.protocol = Input.ofNullable(protocol);
            return this;
        }

        public Builder sslPolicy(@Nullable Input<String> sslPolicy) {
            this.sslPolicy = sslPolicy;
            return this;
        }

        public Builder sslPolicy(@Nullable String sslPolicy) {
            this.sslPolicy = Input.ofNullable(sslPolicy);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder tagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }
        public ListenerState build() {
            return new ListenerState(alpnPolicy, arn, certificateArn, defaultActions, loadBalancerArn, port, protocol, sslPolicy, tags, tagsAll);
        }
    }
}
