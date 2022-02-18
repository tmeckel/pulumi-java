// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1beta2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedZoneServiceDirectoryConfigNamespaceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedZoneServiceDirectoryConfigNamespaceArgs Empty = new ManagedZoneServiceDirectoryConfigNamespaceArgs();

    /**
     * The time that the namespace backing this zone was deleted; an empty string if it still exists. This is in RFC3339 text format. Output only.
     * 
     */
    @InputImport(name="deletionTime")
    private final @Nullable Input<String> deletionTime;

    public Input<String> getDeletionTime() {
        return this.deletionTime == null ? Input.empty() : this.deletionTime;
    }

    @InputImport(name="kind")
    private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * The fully qualified URL of the namespace associated with the zone. Format must be https://servicedirectory.googleapis.com/v1/projects/{project}/locations/{location}/namespaces/{namespace}
     * 
     */
    @InputImport(name="namespaceUrl")
    private final @Nullable Input<String> namespaceUrl;

    public Input<String> getNamespaceUrl() {
        return this.namespaceUrl == null ? Input.empty() : this.namespaceUrl;
    }

    public ManagedZoneServiceDirectoryConfigNamespaceArgs(
        @Nullable Input<String> deletionTime,
        @Nullable Input<String> kind,
        @Nullable Input<String> namespaceUrl) {
        this.deletionTime = deletionTime;
        this.kind = kind;
        this.namespaceUrl = namespaceUrl;
    }

    private ManagedZoneServiceDirectoryConfigNamespaceArgs() {
        this.deletionTime = Input.empty();
        this.kind = Input.empty();
        this.namespaceUrl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZoneServiceDirectoryConfigNamespaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> deletionTime;
        private @Nullable Input<String> kind;
        private @Nullable Input<String> namespaceUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZoneServiceDirectoryConfigNamespaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deletionTime = defaults.deletionTime;
    	      this.kind = defaults.kind;
    	      this.namespaceUrl = defaults.namespaceUrl;
        }

        public Builder setDeletionTime(@Nullable Input<String> deletionTime) {
            this.deletionTime = deletionTime;
            return this;
        }

        public Builder setDeletionTime(@Nullable String deletionTime) {
            this.deletionTime = Input.ofNullable(deletionTime);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setNamespaceUrl(@Nullable Input<String> namespaceUrl) {
            this.namespaceUrl = namespaceUrl;
            return this;
        }

        public Builder setNamespaceUrl(@Nullable String namespaceUrl) {
            this.namespaceUrl = Input.ofNullable(namespaceUrl);
            return this;
        }

        public ManagedZoneServiceDirectoryConfigNamespaceArgs build() {
            return new ManagedZoneServiceDirectoryConfigNamespaceArgs(deletionTime, kind, namespaceUrl);
        }
    }
}
