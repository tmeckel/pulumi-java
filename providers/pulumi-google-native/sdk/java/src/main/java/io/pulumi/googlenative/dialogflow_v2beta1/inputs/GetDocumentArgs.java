// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDocumentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDocumentArgs Empty = new GetDocumentArgs();

    @InputImport(name="documentId", required=true)
    private final String documentId;

    public String getDocumentId() {
        return this.documentId;
    }

    @InputImport(name="knowledgeBaseId", required=true)
    private final String knowledgeBaseId;

    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    @InputImport(name="location", required=true)
    private final String location;

    public String getLocation() {
        return this.location;
    }

    @InputImport(name="project")
    private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetDocumentArgs(
        String documentId,
        String knowledgeBaseId,
        String location,
        @Nullable String project) {
        this.documentId = Objects.requireNonNull(documentId, "expected parameter 'documentId' to be non-null");
        this.knowledgeBaseId = Objects.requireNonNull(knowledgeBaseId, "expected parameter 'knowledgeBaseId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
    }

    private GetDocumentArgs() {
        this.documentId = null;
        this.knowledgeBaseId = null;
        this.location = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDocumentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String documentId;
        private String knowledgeBaseId;
        private String location;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDocumentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.documentId = defaults.documentId;
    	      this.knowledgeBaseId = defaults.knowledgeBaseId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
        }

        public Builder setDocumentId(String documentId) {
            this.documentId = Objects.requireNonNull(documentId);
            return this;
        }

        public Builder setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = Objects.requireNonNull(knowledgeBaseId);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public GetDocumentArgs build() {
            return new GetDocumentArgs(documentId, knowledgeBaseId, location, project);
        }
    }
}
