// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBackupRunArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetBackupRunArgs Empty = new GetBackupRunArgs();

    @InputImport(name="id", required=true)
    private final String id;

    public String getId() {
        return this.id;
    }

    @InputImport(name="instance", required=true)
    private final String instance;

    public String getInstance() {
        return this.instance;
    }

    @InputImport(name="project")
    private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetBackupRunArgs(
        String id,
        String instance,
        @Nullable String project) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.instance = Objects.requireNonNull(instance, "expected parameter 'instance' to be non-null");
        this.project = project;
    }

    private GetBackupRunArgs() {
        this.id = null;
        this.instance = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackupRunArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String instance;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackupRunArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.instance = defaults.instance;
    	      this.project = defaults.project;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setInstance(String instance) {
            this.instance = Objects.requireNonNull(instance);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public GetBackupRunArgs build() {
            return new GetBackupRunArgs(id, instance, project);
        }
    }
}
