// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.firestore;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DocumentArgs extends io.pulumi.resources.ResourceArgs {

    public static final DocumentArgs Empty = new DocumentArgs();

    /**
     * The collection ID, relative to database. For example: chatrooms or chatrooms/my-document/private-messages.
     * 
     */
    @InputImport(name="collection", required=true)
      private final Input<String> collection;

    public Input<String> getCollection() {
        return this.collection;
    }

    /**
     * The Firestore database id. Defaults to `"(default)"`.
     * 
     */
    @InputImport(name="database")
      private final @Nullable Input<String> database;

    public Input<String> getDatabase() {
        return this.database == null ? Input.empty() : this.database;
    }

    /**
     * The client-assigned document ID to use for this document during creation.
     * 
     */
    @InputImport(name="documentId", required=true)
      private final Input<String> documentId;

    public Input<String> getDocumentId() {
        return this.documentId;
    }

    /**
     * The document's [fields](https://cloud.google.com/firestore/docs/reference/rest/v1/projects.databases.documents) formated as a json string.
     * 
     */
    @InputImport(name="fields", required=true)
      private final Input<String> fields;

    public Input<String> getFields() {
        return this.fields;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public DocumentArgs(
        Input<String> collection,
        @Nullable Input<String> database,
        Input<String> documentId,
        Input<String> fields,
        @Nullable Input<String> project) {
        this.collection = Objects.requireNonNull(collection, "expected parameter 'collection' to be non-null");
        this.database = database;
        this.documentId = Objects.requireNonNull(documentId, "expected parameter 'documentId' to be non-null");
        this.fields = Objects.requireNonNull(fields, "expected parameter 'fields' to be non-null");
        this.project = project;
    }

    private DocumentArgs() {
        this.collection = Input.empty();
        this.database = Input.empty();
        this.documentId = Input.empty();
        this.fields = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DocumentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> collection;
        private @Nullable Input<String> database;
        private Input<String> documentId;
        private Input<String> fields;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(DocumentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collection = defaults.collection;
    	      this.database = defaults.database;
    	      this.documentId = defaults.documentId;
    	      this.fields = defaults.fields;
    	      this.project = defaults.project;
        }

        public Builder collection(Input<String> collection) {
            this.collection = Objects.requireNonNull(collection);
            return this;
        }

        public Builder collection(String collection) {
            this.collection = Input.of(Objects.requireNonNull(collection));
            return this;
        }

        public Builder database(@Nullable Input<String> database) {
            this.database = database;
            return this;
        }

        public Builder database(@Nullable String database) {
            this.database = Input.ofNullable(database);
            return this;
        }

        public Builder documentId(Input<String> documentId) {
            this.documentId = Objects.requireNonNull(documentId);
            return this;
        }

        public Builder documentId(String documentId) {
            this.documentId = Input.of(Objects.requireNonNull(documentId));
            return this;
        }

        public Builder fields(Input<String> fields) {
            this.fields = Objects.requireNonNull(fields);
            return this;
        }

        public Builder fields(String fields) {
            this.fields = Input.of(Objects.requireNonNull(fields));
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }
        public DocumentArgs build() {
            return new DocumentArgs(collection, database, documentId, fields, project);
        }
    }
}
