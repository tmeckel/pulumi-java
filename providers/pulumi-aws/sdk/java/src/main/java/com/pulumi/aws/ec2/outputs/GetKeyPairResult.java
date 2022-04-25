// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.aws.ec2.outputs.GetKeyPairFilter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetKeyPairResult {
    /**
     * @return The ARN of the Key Pair.
     * 
     */
    private final String arn;
    private final @Nullable List<GetKeyPairFilter> filters;
    /**
     * @return The SHA-1 digest of the DER encoded private key.
     * 
     */
    private final String fingerprint;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable String keyName;
    private final @Nullable String keyPairId;
    /**
     * @return Any tags assigned to the Key Pair.
     * 
     */
    private final Map<String,String> tags;

    @CustomType.Constructor
    private GetKeyPairResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("filters") @Nullable List<GetKeyPairFilter> filters,
        @CustomType.Parameter("fingerprint") String fingerprint,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("keyName") @Nullable String keyName,
        @CustomType.Parameter("keyPairId") @Nullable String keyPairId,
        @CustomType.Parameter("tags") Map<String,String> tags) {
        this.arn = arn;
        this.filters = filters;
        this.fingerprint = fingerprint;
        this.id = id;
        this.keyName = keyName;
        this.keyPairId = keyPairId;
        this.tags = tags;
    }

    /**
     * @return The ARN of the Key Pair.
     * 
     */
    public String arn() {
        return this.arn;
    }
    public List<GetKeyPairFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The SHA-1 digest of the DER encoded private key.
     * 
     */
    public String fingerprint() {
        return this.fingerprint;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> keyName() {
        return Optional.ofNullable(this.keyName);
    }
    public Optional<String> keyPairId() {
        return Optional.ofNullable(this.keyPairId);
    }
    /**
     * @return Any tags assigned to the Key Pair.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKeyPairResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private @Nullable List<GetKeyPairFilter> filters;
        private String fingerprint;
        private String id;
        private @Nullable String keyName;
        private @Nullable String keyPairId;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKeyPairResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.filters = defaults.filters;
    	      this.fingerprint = defaults.fingerprint;
    	      this.id = defaults.id;
    	      this.keyName = defaults.keyName;
    	      this.keyPairId = defaults.keyPairId;
    	      this.tags = defaults.tags;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder filters(@Nullable List<GetKeyPairFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetKeyPairFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder fingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder keyName(@Nullable String keyName) {
            this.keyName = keyName;
            return this;
        }
        public Builder keyPairId(@Nullable String keyPairId) {
            this.keyPairId = keyPairId;
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }        public GetKeyPairResult build() {
            return new GetKeyPairResult(arn, filters, fingerprint, id, keyName, keyPairId, tags);
        }
    }
}
