// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CxEntityTypeExcludedPhrase {
    /**
     * The word or phrase to be excluded.
     * 
     */
    private final @Nullable String value;

    @OutputCustomType.Constructor
    private CxEntityTypeExcludedPhrase(@OutputCustomType.Parameter("value") @Nullable String value) {
        this.value = value;
    }

    /**
     * The word or phrase to be excluded.
     * 
    */
    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxEntityTypeExcludedPhrase defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(CxEntityTypeExcludedPhrase defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public CxEntityTypeExcludedPhrase build() {
            return new CxEntityTypeExcludedPhrase(value);
        }
    }
}
