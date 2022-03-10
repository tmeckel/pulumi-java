// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.essentialcontacts_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetContactArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetContactArgs Empty = new GetContactArgs();

    @InputImport(name="contactId", required=true)
      private final String contactId;

    public String getContactId() {
        return this.contactId;
    }

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetContactArgs(
        String contactId,
        @Nullable String project) {
        this.contactId = Objects.requireNonNull(contactId, "expected parameter 'contactId' to be non-null");
        this.project = project;
    }

    private GetContactArgs() {
        this.contactId = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetContactArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String contactId;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetContactArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contactId = defaults.contactId;
    	      this.project = defaults.project;
        }

        public Builder contactId(String contactId) {
            this.contactId = Objects.requireNonNull(contactId);
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public GetContactArgs build() {
            return new GetContactArgs(contactId, project);
        }
    }
}
