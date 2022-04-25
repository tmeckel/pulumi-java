// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTestResultFileResult {
    /**
     * @return File contents.
     * 
     */
    private final @Nullable String data;
    /**
     * @return The URI that can be used to request the next section of the result file in the event the file is too large for a single request.
     * 
     */
    private final @Nullable String nextLink;

    @CustomType.Constructor
    private GetTestResultFileResult(
        @CustomType.Parameter("data") @Nullable String data,
        @CustomType.Parameter("nextLink") @Nullable String nextLink) {
        this.data = data;
        this.nextLink = nextLink;
    }

    /**
     * @return File contents.
     * 
     */
    public Optional<String> data() {
        return Optional.ofNullable(this.data);
    }
    /**
     * @return The URI that can be used to request the next section of the result file in the event the file is too large for a single request.
     * 
     */
    public Optional<String> nextLink() {
        return Optional.ofNullable(this.nextLink);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTestResultFileResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String data;
        private @Nullable String nextLink;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTestResultFileResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.data = defaults.data;
    	      this.nextLink = defaults.nextLink;
        }

        public Builder data(@Nullable String data) {
            this.data = data;
            return this;
        }
        public Builder nextLink(@Nullable String nextLink) {
            this.nextLink = nextLink;
            return this;
        }        public GetTestResultFileResult build() {
            return new GetTestResultFileResult(data, nextLink);
        }
    }
}
