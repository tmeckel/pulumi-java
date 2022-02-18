// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.metastore_v1alpha.outputs.ServiceResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetBackupResult {
    /**
     * The time when the backup was started.
     * 
     */
    private final String createTime;
    /**
     * The description of the backup.
     * 
     */
    private final String description;
    /**
     * The time when the backup finished creating.
     * 
     */
    private final String endTime;
    /**
     * Immutable. The relative resource name of the backup, in the following form:projects/{project_number}/locations/{location_id}/services/{service_id}/backups/{backup_id}
     * 
     */
    private final String name;
    /**
     * Services that are restoring from the backup.
     * 
     */
    private final List<String> restoringServices;
    /**
     * The revision of the service at the time of backup.
     * 
     */
    private final ServiceResponse serviceRevision;
    /**
     * The current state of the backup.
     * 
     */
    private final String state;

    @OutputCustomType.Constructor({"createTime","description","endTime","name","restoringServices","serviceRevision","state"})
    private GetBackupResult(
        String createTime,
        String description,
        String endTime,
        String name,
        List<String> restoringServices,
        ServiceResponse serviceRevision,
        String state) {
        this.createTime = Objects.requireNonNull(createTime);
        this.description = Objects.requireNonNull(description);
        this.endTime = Objects.requireNonNull(endTime);
        this.name = Objects.requireNonNull(name);
        this.restoringServices = Objects.requireNonNull(restoringServices);
        this.serviceRevision = Objects.requireNonNull(serviceRevision);
        this.state = Objects.requireNonNull(state);
    }

    /**
     * The time when the backup was started.
     * 
     */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * The description of the backup.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * The time when the backup finished creating.
     * 
     */
    public String getEndTime() {
        return this.endTime;
    }
    /**
     * Immutable. The relative resource name of the backup, in the following form:projects/{project_number}/locations/{location_id}/services/{service_id}/backups/{backup_id}
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Services that are restoring from the backup.
     * 
     */
    public List<String> getRestoringServices() {
        return this.restoringServices;
    }
    /**
     * The revision of the service at the time of backup.
     * 
     */
    public ServiceResponse getServiceRevision() {
        return this.serviceRevision;
    }
    /**
     * The current state of the backup.
     * 
     */
    public String getState() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String description;
        private String endTime;
        private String name;
        private List<String> restoringServices;
        private ServiceResponse serviceRevision;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.endTime = defaults.endTime;
    	      this.name = defaults.name;
    	      this.restoringServices = defaults.restoringServices;
    	      this.serviceRevision = defaults.serviceRevision;
    	      this.state = defaults.state;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setEndTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRestoringServices(List<String> restoringServices) {
            this.restoringServices = Objects.requireNonNull(restoringServices);
            return this;
        }

        public Builder setServiceRevision(ServiceResponse serviceRevision) {
            this.serviceRevision = Objects.requireNonNull(serviceRevision);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public GetBackupResult build() {
            return new GetBackupResult(createTime, description, endTime, name, restoringServices, serviceRevision, state);
        }
    }
}
