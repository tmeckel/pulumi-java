// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.outputs;

import io.pulumi.azurenative.automation.outputs.ContentLinkResponse;
import io.pulumi.azurenative.automation.outputs.RunbookParameterResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RunbookDraftResponse {
    /**
     * Gets or sets the creation time of the runbook draft.
     * 
     */
    private final @Nullable String creationTime;
    /**
     * Gets or sets the draft runbook content link.
     * 
     */
    private final @Nullable ContentLinkResponse draftContentLink;
    /**
     * Gets or sets whether runbook is in edit mode.
     * 
     */
    private final @Nullable Boolean inEdit;
    /**
     * Gets or sets the last modified time of the runbook draft.
     * 
     */
    private final @Nullable String lastModifiedTime;
    /**
     * Gets or sets the runbook output types.
     * 
     */
    private final @Nullable List<String> outputTypes;
    /**
     * Gets or sets the runbook draft parameters.
     * 
     */
    private final @Nullable Map<String,RunbookParameterResponse> parameters;

    @OutputCustomType.Constructor
    private RunbookDraftResponse(
        @OutputCustomType.Parameter("creationTime") @Nullable String creationTime,
        @OutputCustomType.Parameter("draftContentLink") @Nullable ContentLinkResponse draftContentLink,
        @OutputCustomType.Parameter("inEdit") @Nullable Boolean inEdit,
        @OutputCustomType.Parameter("lastModifiedTime") @Nullable String lastModifiedTime,
        @OutputCustomType.Parameter("outputTypes") @Nullable List<String> outputTypes,
        @OutputCustomType.Parameter("parameters") @Nullable Map<String,RunbookParameterResponse> parameters) {
        this.creationTime = creationTime;
        this.draftContentLink = draftContentLink;
        this.inEdit = inEdit;
        this.lastModifiedTime = lastModifiedTime;
        this.outputTypes = outputTypes;
        this.parameters = parameters;
    }

    /**
     * Gets or sets the creation time of the runbook draft.
     * 
    */
    public Optional<String> getCreationTime() {
        return Optional.ofNullable(this.creationTime);
    }
    /**
     * Gets or sets the draft runbook content link.
     * 
    */
    public Optional<ContentLinkResponse> getDraftContentLink() {
        return Optional.ofNullable(this.draftContentLink);
    }
    /**
     * Gets or sets whether runbook is in edit mode.
     * 
    */
    public Optional<Boolean> getInEdit() {
        return Optional.ofNullable(this.inEdit);
    }
    /**
     * Gets or sets the last modified time of the runbook draft.
     * 
    */
    public Optional<String> getLastModifiedTime() {
        return Optional.ofNullable(this.lastModifiedTime);
    }
    /**
     * Gets or sets the runbook output types.
     * 
    */
    public List<String> getOutputTypes() {
        return this.outputTypes == null ? List.of() : this.outputTypes;
    }
    /**
     * Gets or sets the runbook draft parameters.
     * 
    */
    public Map<String,RunbookParameterResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RunbookDraftResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String creationTime;
        private @Nullable ContentLinkResponse draftContentLink;
        private @Nullable Boolean inEdit;
        private @Nullable String lastModifiedTime;
        private @Nullable List<String> outputTypes;
        private @Nullable Map<String,RunbookParameterResponse> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(RunbookDraftResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTime = defaults.creationTime;
    	      this.draftContentLink = defaults.draftContentLink;
    	      this.inEdit = defaults.inEdit;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.outputTypes = defaults.outputTypes;
    	      this.parameters = defaults.parameters;
        }

        public Builder creationTime(@Nullable String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        public Builder draftContentLink(@Nullable ContentLinkResponse draftContentLink) {
            this.draftContentLink = draftContentLink;
            return this;
        }

        public Builder inEdit(@Nullable Boolean inEdit) {
            this.inEdit = inEdit;
            return this;
        }

        public Builder lastModifiedTime(@Nullable String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        public Builder outputTypes(@Nullable List<String> outputTypes) {
            this.outputTypes = outputTypes;
            return this;
        }

        public Builder parameters(@Nullable Map<String,RunbookParameterResponse> parameters) {
            this.parameters = parameters;
            return this;
        }
        public RunbookDraftResponse build() {
            return new RunbookDraftResponse(creationTime, draftContentLink, inEdit, lastModifiedTime, outputTypes, parameters);
        }
    }
}
