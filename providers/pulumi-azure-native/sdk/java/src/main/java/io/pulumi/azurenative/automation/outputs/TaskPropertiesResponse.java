// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TaskPropertiesResponse {
    /**
     * Gets or sets the parameters of the task.
     * 
     */
    private final @Nullable Map<String,String> parameters;
    /**
     * Gets or sets the name of the runbook.
     * 
     */
    private final @Nullable String source;

    @OutputCustomType.Constructor
    private TaskPropertiesResponse(
        @OutputCustomType.Parameter("parameters") @Nullable Map<String,String> parameters,
        @OutputCustomType.Parameter("source") @Nullable String source) {
        this.parameters = parameters;
        this.source = source;
    }

    /**
     * Gets or sets the parameters of the task.
     * 
    */
    public Map<String,String> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * Gets or sets the name of the runbook.
     * 
    */
    public Optional<String> getSource() {
        return Optional.ofNullable(this.source);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> parameters;
        private @Nullable String source;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameters = defaults.parameters;
    	      this.source = defaults.source;
        }

        public Builder parameters(@Nullable Map<String,String> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder source(@Nullable String source) {
            this.source = source;
            return this;
        }
        public TaskPropertiesResponse build() {
            return new TaskPropertiesResponse(parameters, source);
        }
    }
}
