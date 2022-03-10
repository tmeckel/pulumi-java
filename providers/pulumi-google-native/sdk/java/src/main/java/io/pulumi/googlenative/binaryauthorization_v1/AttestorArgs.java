// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.binaryauthorization_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.binaryauthorization_v1.inputs.UserOwnedGrafeasNoteArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AttestorArgs extends io.pulumi.resources.ResourceArgs {

    public static final AttestorArgs Empty = new AttestorArgs();

    @InputImport(name="attestorId", required=true)
      private final Input<String> attestorId;

    public Input<String> getAttestorId() {
        return this.attestorId;
    }

    /**
     * Optional. A descriptive comment. This field may be updated. The field may be displayed in chooser dialogs.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The resource name, in the format: `projects/*{@literal /}attestors/*`. This field may not be updated.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * This specifies how an attestation will be read, and how it will be used during policy enforcement.
     * 
     */
    @InputImport(name="userOwnedGrafeasNote")
      private final @Nullable Input<UserOwnedGrafeasNoteArgs> userOwnedGrafeasNote;

    public Input<UserOwnedGrafeasNoteArgs> getUserOwnedGrafeasNote() {
        return this.userOwnedGrafeasNote == null ? Input.empty() : this.userOwnedGrafeasNote;
    }

    public AttestorArgs(
        Input<String> attestorId,
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<UserOwnedGrafeasNoteArgs> userOwnedGrafeasNote) {
        this.attestorId = Objects.requireNonNull(attestorId, "expected parameter 'attestorId' to be non-null");
        this.description = description;
        this.name = name;
        this.project = project;
        this.userOwnedGrafeasNote = userOwnedGrafeasNote;
    }

    private AttestorArgs() {
        this.attestorId = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.userOwnedGrafeasNote = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttestorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> attestorId;
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<UserOwnedGrafeasNoteArgs> userOwnedGrafeasNote;

        public Builder() {
    	      // Empty
        }

        public Builder(AttestorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attestorId = defaults.attestorId;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.userOwnedGrafeasNote = defaults.userOwnedGrafeasNote;
        }

        public Builder attestorId(Input<String> attestorId) {
            this.attestorId = Objects.requireNonNull(attestorId);
            return this;
        }

        public Builder attestorId(String attestorId) {
            this.attestorId = Input.of(Objects.requireNonNull(attestorId));
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
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

        public Builder userOwnedGrafeasNote(@Nullable Input<UserOwnedGrafeasNoteArgs> userOwnedGrafeasNote) {
            this.userOwnedGrafeasNote = userOwnedGrafeasNote;
            return this;
        }

        public Builder userOwnedGrafeasNote(@Nullable UserOwnedGrafeasNoteArgs userOwnedGrafeasNote) {
            this.userOwnedGrafeasNote = Input.ofNullable(userOwnedGrafeasNote);
            return this;
        }
        public AttestorArgs build() {
            return new AttestorArgs(attestorId, description, name, project, userOwnedGrafeasNote);
        }
    }
}
