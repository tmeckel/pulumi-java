// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GuestDiagnosticsSettingsAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final GuestDiagnosticsSettingsAssociationArgs Empty = new GuestDiagnosticsSettingsAssociationArgs();

    /**
     * The name of the diagnostic settings association.
     * 
     */
    @Import(name="associationName")
      private final @Nullable Output<String> associationName;

    public Output<String> getAssociationName() {
        return this.associationName == null ? Codegen.empty() : this.associationName;
    }

    /**
     * The guest diagnostic settings name.
     * 
     */
    @Import(name="guestDiagnosticSettingsName", required=true)
      private final Output<String> guestDiagnosticSettingsName;

    public Output<String> getGuestDiagnosticSettingsName() {
        return this.guestDiagnosticSettingsName;
    }

    /**
     * Resource location
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The fully qualified ID of the resource, including the resource name and resource type.
     * 
     */
    @Import(name="resourceUri", required=true)
      private final Output<String> resourceUri;

    public Output<String> getResourceUri() {
        return this.resourceUri;
    }

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public GuestDiagnosticsSettingsAssociationArgs(
        @Nullable Output<String> associationName,
        Output<String> guestDiagnosticSettingsName,
        @Nullable Output<String> location,
        Output<String> resourceUri,
        @Nullable Output<Map<String,String>> tags) {
        this.associationName = associationName;
        this.guestDiagnosticSettingsName = Objects.requireNonNull(guestDiagnosticSettingsName, "expected parameter 'guestDiagnosticSettingsName' to be non-null");
        this.location = location;
        this.resourceUri = Objects.requireNonNull(resourceUri, "expected parameter 'resourceUri' to be non-null");
        this.tags = tags;
    }

    private GuestDiagnosticsSettingsAssociationArgs() {
        this.associationName = Codegen.empty();
        this.guestDiagnosticSettingsName = Codegen.empty();
        this.location = Codegen.empty();
        this.resourceUri = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestDiagnosticsSettingsAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> associationName;
        private Output<String> guestDiagnosticSettingsName;
        private @Nullable Output<String> location;
        private Output<String> resourceUri;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestDiagnosticsSettingsAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associationName = defaults.associationName;
    	      this.guestDiagnosticSettingsName = defaults.guestDiagnosticSettingsName;
    	      this.location = defaults.location;
    	      this.resourceUri = defaults.resourceUri;
    	      this.tags = defaults.tags;
        }

        public Builder associationName(@Nullable Output<String> associationName) {
            this.associationName = associationName;
            return this;
        }
        public Builder associationName(@Nullable String associationName) {
            this.associationName = Codegen.ofNullable(associationName);
            return this;
        }
        public Builder guestDiagnosticSettingsName(Output<String> guestDiagnosticSettingsName) {
            this.guestDiagnosticSettingsName = Objects.requireNonNull(guestDiagnosticSettingsName);
            return this;
        }
        public Builder guestDiagnosticSettingsName(String guestDiagnosticSettingsName) {
            this.guestDiagnosticSettingsName = Output.of(Objects.requireNonNull(guestDiagnosticSettingsName));
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder resourceUri(Output<String> resourceUri) {
            this.resourceUri = Objects.requireNonNull(resourceUri);
            return this;
        }
        public Builder resourceUri(String resourceUri) {
            this.resourceUri = Output.of(Objects.requireNonNull(resourceUri));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public GuestDiagnosticsSettingsAssociationArgs build() {
            return new GuestDiagnosticsSettingsAssociationArgs(associationName, guestDiagnosticSettingsName, location, resourceUri, tags);
        }
    }
}
