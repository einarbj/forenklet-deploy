import { Commit } from '../models/commit';

export function getMockCommitsForApp(appname: string): Commit[] {
    return [
        {
            hash: '1402a360346aefd',
            application: appname,
            url: '#',
            timestamp: Date.now(),
            message: 'Merge pull-request #35 into master',
            author: 'Dummy the Cat',
            mergecommit: true
        },
        {
            hash: 'feda134124cd323418',
            application: appname,
            url: '#',
            timestamp: Date.now(),
            message: 'PUS-27 Adding UU-definition file',
            author: 'Dummy the Cat',
            mergecommit: false
        },
        {
            hash: '98cdf452afcde',
            application: appname,
            url: '#',
            timestamp: Date.now(),
            message: 'PUS-11 Legger til en feature som er feature-togglet vekk',
            author: 'Dummy the Cat',
            mergecommit: false
        },
        {
            hash: 'a6a7d6d4cs65f',
            application: appname,
            url: '#',
            timestamp: Date.now(),
            message: 'PUS-12 En dummybeskrivelse av en issue som jeg løste',
            author: 'Dummy the Cat',
            mergecommit: false
        },
        {
            hash: '425fdfa1341de2',
            application: appname,
            url: '#',
            timestamp: Date.now(),
            message: 'FO-123 Fikset en dummy-feature med lite testbehov',
            author: 'Dummy the Cat',
            mergecommit: false
        }
    ];
}
