// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.azurenative.web.outputs.ConsentLinkDefinitionResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListConnectionConsentLinksResult {
    /**
     * Collection of resources
     * 
     */
    private final @Nullable List<ConsentLinkDefinitionResponse> value;

    @OutputCustomType.Constructor
    private ListConnectionConsentLinksResult(@OutputCustomType.Parameter("value") @Nullable List<ConsentLinkDefinitionResponse> value) {
        this.value = value;
    }

    /**
     * Collection of resources
     * 
    */
    public List<ConsentLinkDefinitionResponse> getValue() {
        return this.value == null ? List.of() : this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListConnectionConsentLinksResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ConsentLinkDefinitionResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListConnectionConsentLinksResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder value(@Nullable List<ConsentLinkDefinitionResponse> value) {
            this.value = value;
            return this;
        }
        public ListConnectionConsentLinksResult build() {
            return new ListConnectionConsentLinksResult(value);
        }
    }
}
