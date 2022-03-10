// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.StreamingLocatorContentKeyResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListStreamingLocatorContentKeysResult {
    /**
     * ContentKeys used by current Streaming Locator
     * 
     */
    private final @Nullable List<StreamingLocatorContentKeyResponse> contentKeys;

    @OutputCustomType.Constructor
    private ListStreamingLocatorContentKeysResult(@OutputCustomType.Parameter("contentKeys") @Nullable List<StreamingLocatorContentKeyResponse> contentKeys) {
        this.contentKeys = contentKeys;
    }

    /**
     * ContentKeys used by current Streaming Locator
     * 
    */
    public List<StreamingLocatorContentKeyResponse> getContentKeys() {
        return this.contentKeys == null ? List.of() : this.contentKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListStreamingLocatorContentKeysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<StreamingLocatorContentKeyResponse> contentKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(ListStreamingLocatorContentKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentKeys = defaults.contentKeys;
        }

        public Builder contentKeys(@Nullable List<StreamingLocatorContentKeyResponse> contentKeys) {
            this.contentKeys = contentKeys;
            return this;
        }
        public ListStreamingLocatorContentKeysResult build() {
            return new ListStreamingLocatorContentKeysResult(contentKeys);
        }
    }
}
