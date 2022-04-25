// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.memorydb.outputs;

import com.pulumi.awsnative.memorydb.outputs.ParameterGroupTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetParameterGroupResult {
    /**
     * @return The Amazon Resource Name (ARN) of the parameter group.
     * 
     */
    private final @Nullable String aRN;
    /**
     * @return An array of key-value pairs to apply to this parameter group.
     * 
     */
    private final @Nullable List<ParameterGroupTag> tags;

    @CustomType.Constructor
    private GetParameterGroupResult(
        @CustomType.Parameter("aRN") @Nullable String aRN,
        @CustomType.Parameter("tags") @Nullable List<ParameterGroupTag> tags) {
        this.aRN = aRN;
        this.tags = tags;
    }

    /**
     * @return The Amazon Resource Name (ARN) of the parameter group.
     * 
     */
    public Optional<String> aRN() {
        return Optional.ofNullable(this.aRN);
    }
    /**
     * @return An array of key-value pairs to apply to this parameter group.
     * 
     */
    public List<ParameterGroupTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetParameterGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String aRN;
        private @Nullable List<ParameterGroupTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetParameterGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aRN = defaults.aRN;
    	      this.tags = defaults.tags;
        }

        public Builder aRN(@Nullable String aRN) {
            this.aRN = aRN;
            return this;
        }
        public Builder tags(@Nullable List<ParameterGroupTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(ParameterGroupTag... tags) {
            return tags(List.of(tags));
        }        public GetParameterGroupResult build() {
            return new GetParameterGroupResult(aRN, tags);
        }
    }
}
