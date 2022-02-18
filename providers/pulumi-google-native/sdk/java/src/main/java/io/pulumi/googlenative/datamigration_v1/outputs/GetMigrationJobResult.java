// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datamigration_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.datamigration_v1.outputs.DatabaseTypeResponse;
import io.pulumi.googlenative.datamigration_v1.outputs.ReverseSshConnectivityResponse;
import io.pulumi.googlenative.datamigration_v1.outputs.StaticIpConnectivityResponse;
import io.pulumi.googlenative.datamigration_v1.outputs.StatusResponse;
import io.pulumi.googlenative.datamigration_v1.outputs.VpcPeeringConnectivityResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetMigrationJobResult {
    /**
     * The timestamp when the migration job resource was created. A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
     */
    private final String createTime;
    /**
     * The resource name (URI) of the destination connection profile.
     * 
     */
    private final String destination;
    /**
     * The database engine type and provider of the destination.
     * 
     */
    private final DatabaseTypeResponse destinationDatabase;
    /**
     * The migration job display name.
     * 
     */
    private final String displayName;
    /**
     * The path to the dump file in Google Cloud Storage, in the format: (gs://[BUCKET_NAME]/[OBJECT_NAME]).
     * 
     */
    private final String dumpPath;
    /**
     * The duration of the migration job (in seconds). A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    private final String duration;
    /**
     * If the migration job is completed, the time when it was completed.
     * 
     */
    private final String endTime;
    /**
     * The error details in case of state FAILED.
     * 
     */
    private final StatusResponse error;
    /**
     * The resource labels for migration job to use to annotate any related underlying resources such as Compute Engine VMs. An object containing a list of "key": "value" pairs. Example: `{ "name": "wrench", "mass": "1.3kg", "count": "3" }`.
     * 
     */
    private final Map<String,String> labels;
    /**
     * The name (URI) of this migration job resource, in the form of: projects/{project}/locations/{location}/migrationJobs/{migrationJob}.
     * 
     */
    private final String name;
    /**
     * The current migration job phase.
     * 
     */
    private final String phase;
    /**
     * The details needed to communicate to the source over Reverse SSH tunnel connectivity.
     * 
     */
    private final ReverseSshConnectivityResponse reverseSshConnectivity;
    /**
     * The resource name (URI) of the source connection profile.
     * 
     */
    private final String source;
    /**
     * The database engine type and provider of the source.
     * 
     */
    private final DatabaseTypeResponse sourceDatabase;
    /**
     * The current migration job state.
     * 
     */
    private final String state;
    /**
     * static ip connectivity data (default, no additional details needed).
     * 
     */
    private final StaticIpConnectivityResponse staticIpConnectivity;
    /**
     * The migration job type.
     * 
     */
    private final String type;
    /**
     * The timestamp when the migration job resource was last updated. A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
     */
    private final String updateTime;
    /**
     * The details of the VPC network that the source database is located in.
     * 
     */
    private final VpcPeeringConnectivityResponse vpcPeeringConnectivity;

    @OutputCustomType.Constructor({"createTime","destination","destinationDatabase","displayName","dumpPath","duration","endTime","error","labels","name","phase","reverseSshConnectivity","source","sourceDatabase","state","staticIpConnectivity","type","updateTime","vpcPeeringConnectivity"})
    private GetMigrationJobResult(
        String createTime,
        String destination,
        DatabaseTypeResponse destinationDatabase,
        String displayName,
        String dumpPath,
        String duration,
        String endTime,
        StatusResponse error,
        Map<String,String> labels,
        String name,
        String phase,
        ReverseSshConnectivityResponse reverseSshConnectivity,
        String source,
        DatabaseTypeResponse sourceDatabase,
        String state,
        StaticIpConnectivityResponse staticIpConnectivity,
        String type,
        String updateTime,
        VpcPeeringConnectivityResponse vpcPeeringConnectivity) {
        this.createTime = Objects.requireNonNull(createTime);
        this.destination = Objects.requireNonNull(destination);
        this.destinationDatabase = Objects.requireNonNull(destinationDatabase);
        this.displayName = Objects.requireNonNull(displayName);
        this.dumpPath = Objects.requireNonNull(dumpPath);
        this.duration = Objects.requireNonNull(duration);
        this.endTime = Objects.requireNonNull(endTime);
        this.error = Objects.requireNonNull(error);
        this.labels = Objects.requireNonNull(labels);
        this.name = Objects.requireNonNull(name);
        this.phase = Objects.requireNonNull(phase);
        this.reverseSshConnectivity = Objects.requireNonNull(reverseSshConnectivity);
        this.source = Objects.requireNonNull(source);
        this.sourceDatabase = Objects.requireNonNull(sourceDatabase);
        this.state = Objects.requireNonNull(state);
        this.staticIpConnectivity = Objects.requireNonNull(staticIpConnectivity);
        this.type = Objects.requireNonNull(type);
        this.updateTime = Objects.requireNonNull(updateTime);
        this.vpcPeeringConnectivity = Objects.requireNonNull(vpcPeeringConnectivity);
    }

    /**
     * The timestamp when the migration job resource was created. A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
     */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * The resource name (URI) of the destination connection profile.
     * 
     */
    public String getDestination() {
        return this.destination;
    }
    /**
     * The database engine type and provider of the destination.
     * 
     */
    public DatabaseTypeResponse getDestinationDatabase() {
        return this.destinationDatabase;
    }
    /**
     * The migration job display name.
     * 
     */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The path to the dump file in Google Cloud Storage, in the format: (gs://[BUCKET_NAME]/[OBJECT_NAME]).
     * 
     */
    public String getDumpPath() {
        return this.dumpPath;
    }
    /**
     * The duration of the migration job (in seconds). A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    public String getDuration() {
        return this.duration;
    }
    /**
     * If the migration job is completed, the time when it was completed.
     * 
     */
    public String getEndTime() {
        return this.endTime;
    }
    /**
     * The error details in case of state FAILED.
     * 
     */
    public StatusResponse getError() {
        return this.error;
    }
    /**
     * The resource labels for migration job to use to annotate any related underlying resources such as Compute Engine VMs. An object containing a list of "key": "value" pairs. Example: `{ "name": "wrench", "mass": "1.3kg", "count": "3" }`.
     * 
     */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * The name (URI) of this migration job resource, in the form of: projects/{project}/locations/{location}/migrationJobs/{migrationJob}.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The current migration job phase.
     * 
     */
    public String getPhase() {
        return this.phase;
    }
    /**
     * The details needed to communicate to the source over Reverse SSH tunnel connectivity.
     * 
     */
    public ReverseSshConnectivityResponse getReverseSshConnectivity() {
        return this.reverseSshConnectivity;
    }
    /**
     * The resource name (URI) of the source connection profile.
     * 
     */
    public String getSource() {
        return this.source;
    }
    /**
     * The database engine type and provider of the source.
     * 
     */
    public DatabaseTypeResponse getSourceDatabase() {
        return this.sourceDatabase;
    }
    /**
     * The current migration job state.
     * 
     */
    public String getState() {
        return this.state;
    }
    /**
     * static ip connectivity data (default, no additional details needed).
     * 
     */
    public StaticIpConnectivityResponse getStaticIpConnectivity() {
        return this.staticIpConnectivity;
    }
    /**
     * The migration job type.
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * The timestamp when the migration job resource was last updated. A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
     */
    public String getUpdateTime() {
        return this.updateTime;
    }
    /**
     * The details of the VPC network that the source database is located in.
     * 
     */
    public VpcPeeringConnectivityResponse getVpcPeeringConnectivity() {
        return this.vpcPeeringConnectivity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMigrationJobResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String destination;
        private DatabaseTypeResponse destinationDatabase;
        private String displayName;
        private String dumpPath;
        private String duration;
        private String endTime;
        private StatusResponse error;
        private Map<String,String> labels;
        private String name;
        private String phase;
        private ReverseSshConnectivityResponse reverseSshConnectivity;
        private String source;
        private DatabaseTypeResponse sourceDatabase;
        private String state;
        private StaticIpConnectivityResponse staticIpConnectivity;
        private String type;
        private String updateTime;
        private VpcPeeringConnectivityResponse vpcPeeringConnectivity;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMigrationJobResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.destination = defaults.destination;
    	      this.destinationDatabase = defaults.destinationDatabase;
    	      this.displayName = defaults.displayName;
    	      this.dumpPath = defaults.dumpPath;
    	      this.duration = defaults.duration;
    	      this.endTime = defaults.endTime;
    	      this.error = defaults.error;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.phase = defaults.phase;
    	      this.reverseSshConnectivity = defaults.reverseSshConnectivity;
    	      this.source = defaults.source;
    	      this.sourceDatabase = defaults.sourceDatabase;
    	      this.state = defaults.state;
    	      this.staticIpConnectivity = defaults.staticIpConnectivity;
    	      this.type = defaults.type;
    	      this.updateTime = defaults.updateTime;
    	      this.vpcPeeringConnectivity = defaults.vpcPeeringConnectivity;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDestination(String destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }

        public Builder setDestinationDatabase(DatabaseTypeResponse destinationDatabase) {
            this.destinationDatabase = Objects.requireNonNull(destinationDatabase);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDumpPath(String dumpPath) {
            this.dumpPath = Objects.requireNonNull(dumpPath);
            return this;
        }

        public Builder setDuration(String duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }

        public Builder setEndTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }

        public Builder setError(StatusResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPhase(String phase) {
            this.phase = Objects.requireNonNull(phase);
            return this;
        }

        public Builder setReverseSshConnectivity(ReverseSshConnectivityResponse reverseSshConnectivity) {
            this.reverseSshConnectivity = Objects.requireNonNull(reverseSshConnectivity);
            return this;
        }

        public Builder setSource(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder setSourceDatabase(DatabaseTypeResponse sourceDatabase) {
            this.sourceDatabase = Objects.requireNonNull(sourceDatabase);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setStaticIpConnectivity(StaticIpConnectivityResponse staticIpConnectivity) {
            this.staticIpConnectivity = Objects.requireNonNull(staticIpConnectivity);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }

        public Builder setVpcPeeringConnectivity(VpcPeeringConnectivityResponse vpcPeeringConnectivity) {
            this.vpcPeeringConnectivity = Objects.requireNonNull(vpcPeeringConnectivity);
            return this;
        }

        public GetMigrationJobResult build() {
            return new GetMigrationJobResult(createTime, destination, destinationDatabase, displayName, dumpPath, duration, endTime, error, labels, name, phase, reverseSshConnectivity, source, sourceDatabase, state, staticIpConnectivity, type, updateTime, vpcPeeringConnectivity);
        }
    }
}
