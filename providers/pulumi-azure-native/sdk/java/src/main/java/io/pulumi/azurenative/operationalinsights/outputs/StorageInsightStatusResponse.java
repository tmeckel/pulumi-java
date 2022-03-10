// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class StorageInsightStatusResponse {
    /**
     * Description of the state of the storage insight.
     * 
     */
    private final @Nullable String description;
    /**
     * The state of the storage insight connection to the workspace
     * 
     */
    private final String state;

    @OutputCustomType.Constructor
    private StorageInsightStatusResponse(
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("state") String state) {
        this.description = description;
        this.state = state;
    }

    /**
     * Description of the state of the storage insight.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The state of the storage insight connection to the workspace
     * 
    */
    public String getState() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageInsightStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageInsightStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.state = defaults.state;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public StorageInsightStatusResponse build() {
            return new StorageInsightStatusResponse(description, state);
        }
    }
}
