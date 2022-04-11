// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specify CDN TTLs for response error codes.
 * 
 */
public final class BackendServiceCdnPolicyNegativeCachingPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackendServiceCdnPolicyNegativeCachingPolicyArgs Empty = new BackendServiceCdnPolicyNegativeCachingPolicyArgs();

    /**
     * The HTTP status code to define a TTL against. Only HTTP status codes 300, 301, 302, 307, 308, 404, 405, 410, 421, 451 and 501 are can be specified as values, and you cannot specify a status code more than once.
     * 
     */
    @Import(name="code")
      private final @Nullable Output<Integer> code;

    public Output<Integer> getCode() {
        return this.code == null ? Codegen.empty() : this.code;
    }

    /**
     * The TTL (in seconds) for which to cache responses with the corresponding status code. The maximum allowed value is 1800s (30 minutes), noting that infrequently accessed objects may be evicted from the cache before the defined TTL.
     * 
     */
    @Import(name="ttl")
      private final @Nullable Output<Integer> ttl;

    public Output<Integer> getTtl() {
        return this.ttl == null ? Codegen.empty() : this.ttl;
    }

    public BackendServiceCdnPolicyNegativeCachingPolicyArgs(
        @Nullable Output<Integer> code,
        @Nullable Output<Integer> ttl) {
        this.code = code;
        this.ttl = ttl;
    }

    private BackendServiceCdnPolicyNegativeCachingPolicyArgs() {
        this.code = Codegen.empty();
        this.ttl = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendServiceCdnPolicyNegativeCachingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> code;
        private @Nullable Output<Integer> ttl;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendServiceCdnPolicyNegativeCachingPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.ttl = defaults.ttl;
        }

        public Builder code(@Nullable Output<Integer> code) {
            this.code = code;
            return this;
        }
        public Builder code(@Nullable Integer code) {
            this.code = Codegen.ofNullable(code);
            return this;
        }
        public Builder ttl(@Nullable Output<Integer> ttl) {
            this.ttl = ttl;
            return this;
        }
        public Builder ttl(@Nullable Integer ttl) {
            this.ttl = Codegen.ofNullable(ttl);
            return this;
        }        public BackendServiceCdnPolicyNegativeCachingPolicyArgs build() {
            return new BackendServiceCdnPolicyNegativeCachingPolicyArgs(code, ttl);
        }
    }
}
